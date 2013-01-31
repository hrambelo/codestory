package com.hrambelo.codestory.web.service.manager.impl;


import com.hrambelo.codestory.web.service.manager.IAnswer;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">bensmania@gmail.com</a>
 * Date: 30/01/13 - Time: 21:16
 * Package: com.mkyong.common.manager.impl
 * Codestory
 */
public class AlwaysYesAnswer implements IAnswer {

    @Override
    public String answer() {
        return "NON";
    }
}
