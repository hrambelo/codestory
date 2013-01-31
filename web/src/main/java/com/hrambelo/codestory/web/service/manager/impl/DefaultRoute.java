package com.hrambelo.codestory.web.service.manager.impl;

import com.hrambelo.codestory.web.service.manager.IAnswer;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 09:49
 * Package: com.hrambelo.codestory.web.service.manager.impl
 * Codestory
 */
public class DefaultRoute implements IAnswer {
    @Override
    public String answer() {
        return "go and see <a href=\"http://code-story.net/\">codestory 2013</a>";
    }
}
