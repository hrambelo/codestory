package com.hrambelo.codestory.web.factory.impl;

import com.hrambelo.codestory.web.factory.AFactory;
import com.hrambelo.codestory.web.service.manager.IAnswer;
import com.hrambelo.codestory.web.service.manager.impl.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">bensmania@gmail.com</a>
 * Date: 30/01/13 - Time: 21:15
 * Package: com.mkyong.common.manager.factory
 * Codestory
 */
@Component(value = "questionFactory")
//Even Spring's default, clarity rule first FTW
@Scope("singleton")
public class ManagerFactory extends AFactory {

    @Override
    public IAnswer createEmailAnswer() {
        return new Email();
    }

    @Override
    public IAnswer createHappyAnswer() {
        return new Happy();
    }

    @Override
    public IAnswer createMailingAnswer() {
        return new Mailing();
    }

    @Override
    public IAnswer createMarkDownAnswer() {
        return new MarkDown();
    }

    @Override
    public IAnswer createReceiveAllAnswer() {
        return new ReceiveFirstSubject();
    }

    @Override
    public IAnswer createAlwaysYesAnswer() {
        return new AlwaysYesAnswer();
    }

    @Override
    public IAnswer createDefaultRoute() {
        return new DefaultRoute();
    }

    @Override
    public IAnswer createGoodNightAnswer() {
        return new GoodNight();
    }
}
