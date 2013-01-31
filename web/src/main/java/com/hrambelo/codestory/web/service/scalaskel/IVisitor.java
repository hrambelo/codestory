package com.hrambelo.codestory.web.service.scalaskel;

/**
 * Play the role of a Visitable in visitor design pattern
 * Catch composite parsing behaviour
 *
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 00:29
 * Package: com.hrambelo.codestory.business.scalaskel
 * Codestory
 */
public interface IVisitor {

    /**
     * Behaviour when visiting a leaf targeting DRY
     * @param money the leaf
     * @param combinaison the combinaison to be applied there
     * @return wrap return into Object to get higher abstraction(depend upon abstraction)
     */
    Object visitBasicMoney(AMoney money, Combinaison combinaison);

    /**
     * Behaviour when visiting a composite targeting DRY
     * @param money the composite
     * @param combinaison the combinaison to be applied there
     * @return wrap return into Object to get higher abstraction(depend upon abstraction
     */
    Object visitCompositeMoney(AMoney money, Combinaison combinaison);
}