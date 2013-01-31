package com.hrambelo.codestory.web.service.scalaskel.impl.composite;


import com.hrambelo.codestory.web.service.scalaskel.AMoney;
import com.hrambelo.codestory.web.service.scalaskel.Combinaison;
import com.hrambelo.codestory.web.service.scalaskel.IVisitor;
import com.hrambelo.codestory.web.service.scalaskel.factory.ScalaskelFactory;

/**
 *
 * play the role of Element on visitor design pattern especially for leaf
 *
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 01:24
 * Package: com.hrambelo.codestory.web.service.scalaskel.impl.composite
 * Codestory
 */
public class Foo extends AMoney {

    public Foo() {
        super("Foo", 1);
    }

    @Override
    public Object accept(IVisitor visitor, Combinaison combinaison) {
        return visitor.visitBasicMoney(this, combinaison);
    }

    @Override
    public Combinaison populateCombinaison(Combinaison combinaison, int value) {
        return combinaison.setFoo(value);
    }

    @Override
    public Combinaison newCombinaison(Combinaison combinaison) {
        return ScalaskelFactory.createCombinaison(combinaison.getBaz(), combinaison.getQix(), combinaison.getBar(), 0);
    }
}
