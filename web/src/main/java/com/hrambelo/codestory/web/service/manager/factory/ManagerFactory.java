package com.hrambelo.codestory.web.service.manager.factory;

import com.hrambelo.codestory.web.service.manager.AFactory;
import com.hrambelo.codestory.web.service.manager.IAnswer;
import com.hrambelo.codestory.web.service.manager.impl.*;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">bensmania@gmail.com</a>
 * Date: 30/01/13 - Time: 21:15
 * Package: com.mkyong.common.manager.factory
 * Codestory
 */
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
    public IAnswer createStillThereAnswer() {
        return new StillAnswer();
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
