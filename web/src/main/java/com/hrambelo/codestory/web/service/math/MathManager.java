package com.hrambelo.codestory.web.service.math;

import com.hrambelo.codestory.web.factory.AFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 19:18
 * Package: com.hrambelo.codestory.web.service.math
 * Codestory
 */
public class MathManager {

    private static final Logger logger = LoggerFactory.getLogger(MathManager.class);

    private final AFactory factory;

    private ICompute currentComputation;

    public MathManager(AFactory mathFactory) {
        this.factory = mathFactory;
        this.currentComputation = factory.createAdd();
    }

    public MathManager defineComputation(String operand){
        return performSuperTrickyAnalyze(operand);
    }

    private MathManager performSuperTrickyAnalyze(String operand) {
        Assert.hasLength(operand, "You really ask me to compute without operand ?");
        if(operand.equals("+")){
            currentComputation = factory.createAdd();
        } else if(operand.equals("-")){
            currentComputation = factory.createSubstract();
        } else if (operand.equals("/")) {
            currentComputation = factory.createDivide();
        } else if (operand.equals("*")){
            currentComputation = factory.createMultiply();
        } else if (!operand.equals("")){
            logger.info("GRAAVE unknown Operand : " + operand);
        }
        return this;
    }

    public String compute(String lhs_in, String rhs_in) {
        String result = "Did not perform any computation";
        try {
            int lhs = Integer.valueOf(lhs_in);
            int rhs = Integer.valueOf(rhs_in);
            result = String.valueOf(currentComputation.compute(lhs, rhs));
        }
        catch (NumberFormatException e) {
            logger.info("GRAAVE lhs or rhs seems doesnt seem to be number ?");
        }
        return result;
    }
}
