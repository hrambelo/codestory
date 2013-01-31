package com.hrambelo.codestory.web.service.manager;

import com.hrambelo.codestory.web.service.manager.impl.Email;

/**
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
        } else if (question.contains("tu reponds toujours")) {
            result = managerFactory.createStillThereAnswer();
        } else if (question.contains("bien recu le premier enonce")) {
            result = managerFactory.createReceiveAllAnswer();
        } else if (question.contains("passe une bonne nuit")){
            result = managerFactory.createGoodNightAnswer();
        }
        return result;
    }
}
