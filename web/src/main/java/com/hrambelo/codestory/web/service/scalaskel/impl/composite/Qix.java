package com.hrambelo.codestory.web.service.scalaskel.impl.composite;

import com.hrambelo.codestory.web.service.scalaskel.Combinaison;
import com.hrambelo.codestory.web.service.scalaskel.factory.ScalaskelFactory;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 01:24
 * Package: com.hrambelo.codestory.web.controller.impl.composite
 * Codestory
 */
public class Qix extends ACompositeMoney {

    public Qix() {
        super("Qix", 11, ScalaskelFactory.createBar());
    }

    @Override
    public Combinaison populateCombinaison(Combinaison combinaison, int value) {
        return combinaison.setQix(value);
    }

    @Override
    public Combinaison newCombinaison(Combinaison combinaison) {
        return ScalaskelFactory.createCombinaison(combinaison.getBaz(), 0, 0, 0);
    }
}
