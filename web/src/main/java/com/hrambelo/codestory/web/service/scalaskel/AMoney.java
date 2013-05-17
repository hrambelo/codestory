package com.hrambelo.codestory.web.service.scalaskel;

import com.hrambelo.codestory.web.factory.AFactory;
import com.hrambelo.codestory.web.factory.impl.MoneyFactory;

/**
 * Represent a generic money,
 * play the role of Component in composite pattern,
 * play the role of ElementLike in visitor pattern
 * Handle common aspect of each money for DRY
 * Handle money default behaviour for YAGNI
 *
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 00:29
 * Package: com.hrambelo.codestory.business.scalaskel
 * Codestory
 */
public abstract class AMoney {

    protected static final AFactory MONEY_FACTORY = new MoneyFactory();

    /**
     * A name identify a money
     */
    private final String name;

    /**
     * Value represent its amount
     */
    private final int value;

    /**
     *
     * @return money's value
     */
    public int getValue() {
        return value;
    }

    /**
     * Constructor that creates an out of the box money
     * @param name its name
     * @param value its value
     */
    protected AMoney(String name, int value){
        this.name = name;
        this.value = value;
    }

    /**
     * By default inspecting child is forbidden
     * @throws UnsupportedOperationException
     */
    public AMoney getChild(){
        throw new UnsupportedOperationException("unallowed as default operation");
    }

    /**
     * Each money is able to know how many of them match a total,
     * if total is lesser than current money's value then try with current money's child
     * @param total
     * @return quantity of current money matching total
     */
    public int compute(int total) {
        try {
            if (total < value) {
                getChild().compute(total);
            }
        } catch (UnsupportedOperationException e) {
            //System.out.println("money" +name+ "is leaf");
        }
        return total / value;
    }

    /**
     * Get the rest of the division, if total is lesser than current money's value then pass to current money's child
     * @param total
     * @return the rest of the division
     */
    public int modulo(int total){
        try{
            if (total < value){
                getChild().modulo(total);
            }
        } catch (UnsupportedOperationException e) {
            System.out.println("money" +name+ "is leaf");
        }
        return total % value;
    }

    /**
     * Visitor element to accept a visitor with a given combinaison
     * @param visitor
     * @param combinaison
     * @return list of all combinaisons wrapped by Collection
     */
    public abstract Object accept(IVisitor visitor, Combinaison combinaison);

    /**
     * Populate a particular combinaison with a value
     * @param combinaison the particular combinaison
     * @param value th value to be set
     * @return the populated combinaison
     */
    public abstract Combinaison populateCombinaison(Combinaison combinaison, int value);

    /**
     * Create custom new combinaison when it is appropriate (i.e.: during recursion)
     * @param combinaison base combinaison configuration to start from
     * @return the newly created combinaison
     */
    public abstract Combinaison newCombinaison(Combinaison combinaison);
}