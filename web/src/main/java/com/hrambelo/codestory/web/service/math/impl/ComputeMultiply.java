package com.hrambelo.codestory.web.service.math.impl;

import com.hrambelo.codestory.web.service.math.ICompute;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 18:49
 * Package: com.hrambelo.codestory.web.service.math.impl
 * Codestory
 */
public class ComputeMultiply implements ICompute {
    @Override
    public int compute(int lhs, int rhs) {
        return lhs * rhs;
    }
}
