package com.hrambelo.codestory.web.service.scalaskel;

import com.hrambelo.codestory.web.factory.AFactory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 00:29
 * Package: com.hrambelo.codestory.business.scalaskel
 * Codestory
 */
public class ExchangeService {

    private final AFactory scalaskelFactory;
    private final AMoney moneyToBeExchanged;
    private final int total;

    public ExchangeService(AFactory scalaskelFactory, int total){
        this.scalaskelFactory = scalaskelFactory;
        this.moneyToBeExchanged = scalaskelFactory.createBaz();
        this.total = total;
    }

    public List<Object> exchange(){
        IVisitor visitor = scalaskelFactory.createServiceWorker(total);
        return (List<Object>) moneyToBeExchanged.accept(visitor, new Combinaison(0, 0, 0, 0));
    }


}
