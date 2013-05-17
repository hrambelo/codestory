package com.hrambelo.codestory.web.service.scalaskel.impl.composite;


import com.hrambelo.codestory.web.service.scalaskel.Combinaison;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 01:23
 * Package: com.hrambelo.codestory.web.service.scalaskel.impl.composite
 * Codestory
 */
public class Bar extends ACompositeMoney {

    public Bar() {
        super("Bar", 7, MONEY_FACTORY.createFoo());
    }

    @Override
    public Combinaison populateCombinaison(Combinaison combinaison, int value) {
        return combinaison.setBar(value);
    }

    @Override
    public Combinaison newCombinaison(Combinaison combinaison) {
        return MONEY_FACTORY.createCombinaison(combinaison.getBaz(), combinaison.getQix(), 0);
    }
}
