package com.hrambelo.codestory.web.service.scalaskel.impl;

import com.hrambelo.codestory.web.service.scalaskel.AMoney;
import com.hrambelo.codestory.web.service.scalaskel.Combinaison;
import com.hrambelo.codestory.web.service.scalaskel.IVisitor;
import com.hrambelo.codestory.web.factory.AFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Play the role of Visitor on visitor design pattern
 *
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a></a>
 * Date: 31/01/13 - Time: 01:07
 * Package: com.hrambelo.codestory.web.service.scalaskel.impl.visitor
 * Codestory
 */
public class ServiceWorker implements IVisitor {

    private final List<Combinaison> combinaisons = new ArrayList<Combinaison>();
    private final AFactory scalaskelFactory;
    private final int total;

    public ServiceWorker(AFactory scalaskelFactory, int total) {
        this.total = total;
        this.scalaskelFactory = scalaskelFactory;
    }

    @Override
    public Object visitBasicMoney(AMoney money, Combinaison combinaison) {
        int div = money.compute(total);
        combinaison = money.populateCombinaison(combinaison, div);
        combinaisons.add(combinaison);
        return combinaisons;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Catch commmon behaviour used on composite money all along recursivity for DRY
     * @param money the composite
     * @param combinaison the combinaison to be applied there
     * @return
     */
    @Override
    public Object visitCompositeMoney(AMoney money, Combinaison combinaison) {

        int div = money.compute(total);
        int modulo = money.modulo(total);
        while (div >= 0){
            combinaison = money.populateCombinaison(combinaison, div);
            //update total value here
            IVisitor v = scalaskelFactory.createServiceWorker(modulo);
            combinaisons.addAll((List<Combinaison>)money.getChild().accept(v, combinaison));
            combinaison = money.newCombinaison(combinaison);
            div--;
            modulo = total - (div * money.getValue());
        }
        return combinaisons;
    }
}
