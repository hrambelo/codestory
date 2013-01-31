package com.hrambelo.codestory.web.service.math.factory;

import com.hrambelo.codestory.web.service.math.AMathFactory;
import com.hrambelo.codestory.web.service.math.ICompute;
import com.hrambelo.codestory.web.service.math.impl.*;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 19:20
 * Package: com.hrambelo.codestory.web.service.math.factory
 * Codestory
 */
public class MathFactory extends AMathFactory {
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
