package com.hrambelo.codestory.web.service.math;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 19:18
 * Package: com.hrambelo.codestory.web.service.math
 * Codestory
 */
public abstract class AMathFactory {

    public abstract ICompute createAdd();

    public abstract ICompute createDivide();

    public abstract ICompute createMultiply();

    public abstract ICompute createSubstract();

    public abstract ICompute createNoOp();
}
