package com.excercise.power.recursive;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BasePowerHalf extends AbstractBaseToPower {

    /**
     * basePowerHalf O(N/2)
     * @return
     */
    public double baseToPower(double base, int power) {
        if (power == 0) {
            resultToReturn =  1D;
        } else if (power == 1) {
            resultToReturn = base;
        } else {
            resultToReturn = optmizeRecursive(base, power, 1D);
        }
        return resultToReturn;
    }


    private double optmizeRecursive(double base, int power, double resultToReturn) {
        int tempHalf = 0;
        if ((power % 2) == 0 && power > 1) {
            tempHalf = power / 2;
            optmizeRecursive(base, tempHalf, resultToReturn);
        }

        do {
            resultToReturn = resultToReturn * base;
            power --;
        } while (power != 0);
        return resultToReturn;
    }
}
