package com.hrambelo.codestory.web.factory.impl;

import com.hrambelo.codestory.web.factory.AFactory;
import com.hrambelo.codestory.web.service.scalaskel.AMoney;
import com.hrambelo.codestory.web.service.scalaskel.impl.composite.Bar;
import com.hrambelo.codestory.web.service.scalaskel.impl.composite.Baz;
import com.hrambelo.codestory.web.service.scalaskel.impl.composite.Foo;
import com.hrambelo.codestory.web.service.scalaskel.impl.composite.Qix;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//Even Spring's default, clarity rule first FTW
@Scope("singleton")
public class MoneyFactory extends AFactory {

    public AMoney createBaz() {
        return new Baz();
    }

    public AMoney createQix() {
        return new Qix();
    }

    public AMoney createBar() {
        return new Bar();
    }

    public AMoney createFoo() {
        return new Foo();
    }
}