package com.hrambelo.codestory.web.controller;

import com.hrambelo.codestory.web.service.manager.factory.ManagerFactory;
import com.hrambelo.codestory.web.service.manager.AFactory;
import com.hrambelo.codestory.web.service.manager.QuestionManager;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;
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

    private static final AFactory factory = new ManagerFactory();

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public @ResponseBody String handleQuestion(@RequestParam("q") String question){
        return new QuestionManager(factory).configureRoute(question).answer();
    }
}
