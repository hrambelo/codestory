package com.hrambelo.codestory.web.factory;

import com.hrambelo.codestory.web.service.manager.IAnswer;
import com.hrambelo.codestory.web.service.manager.QuestionManager;
import com.hrambelo.codestory.web.service.math.ICompute;
import com.hrambelo.codestory.web.service.math.MathManager;
import com.hrambelo.codestory.web.service.scalaskel.AMoney;
import com.hrambelo.codestory.web.service.scalaskel.Combinaison;
import com.hrambelo.codestory.web.service.scalaskel.ExchangeService;
import com.hrambelo.codestory.web.service.scalaskel.IVisitor;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">bensmania@gmail.com</a>
 * Date: 30/01/13 - Time: 20:05
 * Package: com.mkyong.common.manager
 * Codestory
 */
public abstract class AFactory {

    public IAnswer createEmailAnswer() {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public IAnswer createHappyAnswer() {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public IAnswer createMailingAnswer() {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public IAnswer createMarkDownAnswer() {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public IAnswer createReceiveAllAnswer() {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public IAnswer createAlwaysYesAnswer() {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public IAnswer createDefaultRoute() {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public IAnswer createGoodNightAnswer() {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public ICompute createAdd(){
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public ICompute createDivide(){
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public ICompute createMultiply(){
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public ICompute createSubstract(){
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public ICompute createNoOp(){
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public AMoney createBaz() {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public AMoney createQix() {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public AMoney createBar() {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public AMoney createFoo() {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public IVisitor createServiceWorker(int total) {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public Combinaison createCombinaison(int baz, int qix, int bar) {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public ExchangeService createScalaskelService(AFactory scalaskelFactory, int total) {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public QuestionManager createQuestionService(AFactory answerFactory) {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }

    public MathManager createMathService(AFactory mathFactory) {
        throw new UnsupportedOperationException("Eeem seems you hit a default or wrong factory, please request to a more specific or change to a more appropriate specific one");
    }
}
