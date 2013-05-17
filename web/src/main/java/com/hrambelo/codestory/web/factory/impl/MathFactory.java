package com.hrambelo.codestory.web.factory.impl;

import com.hrambelo.codestory.web.factory.AFactory;
import com.hrambelo.codestory.web.service.math.ICompute;
import com.hrambelo.codestory.web.service.math.impl.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 19:20
 * Package: com.hrambelo.codestory.web.service.math.factory
 * Codestory
 */
@Component(value = "arithmFactory")
//Even Spring's default, clarity rule first FTW
@Scope("singleton")
public class MathFactory extends AFactory {

    @Override
    public ICompute createAdd() {
        return new ComputeAdd();
    }

    @Override
    public ICompute createDivide() {
        return new ComputeDivide();
    }

    @Override
    public ICompute createMultiply() {
        return new ComputeMultiply();
    }

    @Override
    public ICompute createSubstract() {
        return new ComputeSubstract();
    }

    @Override
    public ICompute createNoOp() {
        return new NoOp();
    }
}
