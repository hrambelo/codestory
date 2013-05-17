package com.hrambelo.codestory.web.factory.impl;

import com.hrambelo.codestory.web.factory.AFactory;
import com.hrambelo.codestory.web.service.manager.QuestionManager;
import com.hrambelo.codestory.web.service.math.MathManager;
import com.hrambelo.codestory.web.service.scalaskel.ExchangeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 05/05/13 - Time: 23:05
 * Package: com.hrambelo.codestory.web.factory.impl
 * Codestory
 */
@Component
//Even Spring's default, clarity rule first FTW
@Scope("singleton")
public class CoreFactory extends AFactory{

    public QuestionManager createQuestionService(AFactory answerFactory) {
        return new QuestionManager(answerFactory);
    }

    public MathManager createMathService(AFactory mathFactory) {
        return new MathManager(mathFactory);
    }

    public ExchangeService createScalaskelService(AFactory scalaskelFactory, int total) {
        return new ExchangeService(scalaskelFactory, total);
    }
}
