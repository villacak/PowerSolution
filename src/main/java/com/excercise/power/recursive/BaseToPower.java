package com.excercise.power.recursive;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BaseToPower extends AbstractBaseToPower {

    /**
     * baseToPower with O(N)
     * @return
     */
    public double baseToPower(double base, int power) {
        if (power == 0) {
            resultToReturn = 1D;
        } else if (power == 1) {
            resultToReturn = base;
        } else {
            resultToReturn = 1D;
            while (power != 0) {
                resultToReturn = resultToReturn * base;
                power--;
            }
        }
        return resultToReturn;
    }
}
