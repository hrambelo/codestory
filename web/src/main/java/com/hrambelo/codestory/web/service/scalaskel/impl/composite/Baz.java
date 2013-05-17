package com.hrambelo.codestory.web.service.scalaskel.impl.composite;


import com.hrambelo.codestory.web.service.scalaskel.Combinaison;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 01:23
 * Package: com.hrambelo.codestory.web.service.scalaskel.impl.composite
 * Codestory
 */
public class Baz extends ACompositeMoney {

    public Baz() {
        super("Baz", 21, MONEY_FACTORY.createQix());
    }

    @Override
    public Combinaison populateCombinaison(Combinaison combinaison, int value) {
        return combinaison.setBaz(value);
    }

    @Override
    public Combinaison newCombinaison(Combinaison combinaison) {
        return MONEY_FACTORY.createCombinaison(0, 0, 0);
    }
}
