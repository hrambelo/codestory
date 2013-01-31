package com.hrambelo.codestory.web.service.scalaskel;

import com.hrambelo.codestory.web.service.scalaskel.factory.ScalaskelFactory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 00:29
 * Package: com.hrambelo.codestory.business.scalaskel
 * Codestory
 */
public class ExchangeService {

    private final AMoney touristMoney;
    private final int total;

    public ExchangeService(int total){
        this.touristMoney = ScalaskelFactory.createBaz();
        this.total = total;
    }

    public List<Object> exchange(){
        IVisitor visitor = ScalaskelFactory.createServiceWorker(total);
        return (List<Object>)touristMoney.accept(visitor, new Combinaison(0, 0, 0, 0));
    }


}
