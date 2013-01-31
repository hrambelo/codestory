package com.hrambelo.codestory.web.service.manager;

/**
 * Responsible for handling question and choose routes
 *
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">bensmania@gmail.com</a>
 * Date: 30/01/13 - Time: 20:05
 * Package: com.mkyong.common.manager
 * Codestory
 */
public class QuestionManager {

    private final AFactory managerFactory;

    public QuestionManager(AFactory factory) {
        this.managerFactory = factory;
    }

    public IAnswer configureRoute(String question) {
        return performSuperTrickyRouteCalculation(question);
    }

    private IAnswer performSuperTrickyRouteCalculation(String question) {
        //Todo implement a better route handling àla if-free :(

        IAnswer result = managerFactory.createDefaultRoute();
        if(question.contains("email")){
            result = managerFactory.createEmailAnswer();
        }else if(question.contains("heureux")){
            result = managerFactory.createHappyAnswer();
        }else if (question.contains("mailing")) {
            result = managerFactory.createMailingAnswer();
        } else if (question.contains("markdown")) {
            result = managerFactory.createMarkDownAnswer();
        } else if (question.contains("toujours")) {
            result = managerFactory.createAlwaysYesAnswer();
        } else if (question.contains("recu")) {
            result = managerFactory.createReceiveAllAnswer();
        } else if (question.contains("nuit")){
            result = managerFactory.createGoodNightAnswer();
        }
        return result;
    }
}
