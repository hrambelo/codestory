package com.hrambelo.codestory.web.factory.impl;

import com.hrambelo.codestory.web.factory.AFactory;
import com.hrambelo.codestory.web.service.scalaskel.AMoney;
import com.hrambelo.codestory.web.service.scalaskel.Combinaison;
import com.hrambelo.codestory.web.service.scalaskel.IVisitor;
import com.hrambelo.codestory.web.service.scalaskel.impl.ServiceWorker;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 01:44
 * Package: com.hrambelo.codestory.web.service.scalaskel.factory
 * Codestory
 */
@Component
//Even Spring's default, clarity rule first FTW
@Scope("singleton")
public class ScalaskelFactory extends AFactory {
    
    public IVisitor createServiceWorker(int total) {
        return new ServiceWorker(this, total);
    }

    public Combinaison createCombinaison(int baz, int qix, int bar) {
        //as foo always is/starts with 0
        return new Combinaison(baz, qix, bar, 0);
    }
}
