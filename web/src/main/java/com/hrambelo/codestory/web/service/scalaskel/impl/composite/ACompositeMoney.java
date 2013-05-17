package com.hrambelo.codestory.web.service.scalaskel.impl.composite;


import com.hrambelo.codestory.web.service.scalaskel.AMoney;
import com.hrambelo.codestory.web.service.scalaskel.Combinaison;
import com.hrambelo.codestory.web.service.scalaskel.IVisitor;

/**
 * Represent a money mixin : one that can be divided into many other money (but only one direct child per parent),
 * child's value is always lower than parent's value
 * play the role of Composite in composite pattern,
 * play the role of Element on visitor design pattern especially for composite
 * Handle common aspect of each composable money and their behaviour for DRY
 *
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 01:22
 * Package: com.hrambelo.codestory.web.service.scalaskel.impl.composite
 * Codestory
 */
public abstract class ACompositeMoney extends AMoney {

    private final AMoney child;

    ACompositeMoney(String name, int value, AMoney child) {
        super(name, value);
        this.child = child;
    }

    public int compute(int total) {
        if (total < value) {
            getChild().compute(total);
        }
        return total / value;
    }

    public int modulo(int total){
        if (total < value){
            getChild().modulo(total);
        }
        return total % value;
    }

    public AMoney getChild() {
        return child;
    }

    @Override
    public Object accept(IVisitor visitor, Combinaison combinaison) {
        return visitor.visitCompositeMoney(this, combinaison);
    }
}
