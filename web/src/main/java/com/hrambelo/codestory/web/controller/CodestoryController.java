package com.hrambelo.codestory.web.controller;

import com.hrambelo.codestory.web.factory.AFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 30/01/13 - Time: 15:17
 * Package: com.hrambelo.codestory.web.controller
 * Codestory
 */
@Controller
@RequestMapping("/")
public class CodestoryController {

    private static final Logger logger = LoggerFactory.getLogger(CodestoryController.class);

    @Autowired
    @Qualifier(value = "coreFactory")
    private AFactory coreFactory;

    @Autowired
    @Qualifier(value = "questionFactory")
    private AFactory answerFactory;

    @Autowired
    @Qualifier(value = "arithmFactory")
    private AFactory mathFactory;

    @Autowired
    @Qualifier(value = "scalaskelFactory")
    private AFactory scalaskelFactory;

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public @ResponseBody String handleQuestion( @RequestParam("q") String question){
        String regex = "(((\\d+)(\\s)(\\d+))|((\\d+)([-+*/])(\\d+)))";
        String answer = "";
        if (question.matches(regex)){
            String[] s = null;
            if (question.contains(" ")){
                s =  question.split("\\s");
                answer = String.valueOf(new MathManager(mathFactory)
                        //.defineComputation(s[1])
                        .compute(s[0], s[1]));
            }else{
                String newRegex = "(?<=op)|(?=op)".replace("op", "[-+*/()]");
                s = question.split(newRegex);
                answer = String.valueOf(new MathManager(mathFactory)
                    .defineComputation(s[1])
                    .compute(s[0], s[2]));
            }
        }else{
            answer = new QuestionManager(answerFactory)
                    .configureRoute(question)
                    .answer();
        }
        return answer;
    }

    @RequestMapping(value= "enonce/{id}", method=RequestMethod.POST)
    @ResponseBody
    public void postMessage(@PathVariable int id, String body) {
        logger.info("POST: " +id+ "=" +body);
    }

    @RequestMapping(value = "scalaskel/change/{amount}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody String compute(@PathVariable int amount) throws IOException {
        List<Object> results = new ExchangeService(amount).exchange();
        // Mapper json avec option d'inclusion
        return new ObjectMapper()
                .setSerializationInclusion(JsonSerialize.Inclusion.NON_DEFAULT)
                .writeValueAsString(results);
    }
}
