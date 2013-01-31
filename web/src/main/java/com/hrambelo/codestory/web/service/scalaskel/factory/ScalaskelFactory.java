package com.hrambelo.codestory.web.service.scalaskel.factory;

import com.hrambelo.codestory.web.service.scalaskel.AMoney;
import com.hrambelo.codestory.web.service.scalaskel.Combinaison;
import com.hrambelo.codestory.web.service.scalaskel.IVisitor;
import com.hrambelo.codestory.web.service.scalaskel.impl.ServiceWorker;
import com.hrambelo.codestory.web.service.scalaskel.impl.composite.Bar;
import com.hrambelo.codestory.web.service.scalaskel.impl.composite.Baz;
import com.hrambelo.codestory.web.service.scalaskel.impl.composite.Foo;
import com.hrambelo.codestory.web.service.scalaskel.impl.composite.Qix;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 01:44
 * Package: com.hrambelo.codestory.web.service.scalaskel.factory
 * Codestory
 */
public class ScalaskelFactory {
    
    
    public static AMoney createBaz() {
        return new Baz();
    }

    
    public static AMoney createQix() {
        return new Qix();
    }

    
    public static AMoney createBar() {
        return new Bar();
    }

    
    public static AMoney createFoo() {
        return new Foo();
    }

    
    public static IVisitor createServiceWorker(int total) {
        return new ServiceWorker(total);
    }

    
    public static Combinaison createCombinaison(int baz, int qix, int bar, int foo) {
        return new Combinaison(baz, qix, bar, foo);
    }
}
