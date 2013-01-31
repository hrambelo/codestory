package com.hrambelo.codestory.web.service.manager;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">bensmania@gmail.com</a>
 * Date: 30/01/13 - Time: 20:05
 * Package: com.mkyong.common.manager
 * Codestory
 */
public abstract class AFactory {

    public abstract IAnswer createEmailAnswer();

    public abstract IAnswer createHappyAnswer();

    public abstract IAnswer createMailingAnswer();

    public abstract IAnswer createMarkDownAnswer();

    public abstract IAnswer createReceiveAllAnswer();

    public abstract IAnswer createAlwaysYesAnswer();

    public abstract IAnswer createDefaultRoute();

    public abstract IAnswer createGoodNightAnswer();
}
