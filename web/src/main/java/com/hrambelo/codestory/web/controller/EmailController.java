package com.hrambelo.codestory.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">bensmania@gmail.com</a>
 * Date: 30/01/13 - Time: 15:17
 * Package: com.hrambelo.codestory.web.controller
 * Codestory
 */
@Controller
@RequestMapping("/")
public class EmailController {

    @RequestMapping(produces = "application/json", method = RequestMethod.GET)
    public @ResponseBody String showEmail(@RequestParam("q") String question){
        String answer = (question.contains("email"))? "bensmania@gmail.com" : "ask me my email";
        return answer;
    }
}