package com.excercise.power.recursive;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BaseToPowerOptmized extends AbstractBaseToPower {

    @Override
    public double baseToPower(double base, int power) {
        if (power == 0) {
            return 1;
        } else if (power == 1) {
            return base;
        } else {
            return optmizedBaseToPower(base, power, 1);
        }
    }

    private double optmizedBaseToPower(double base, int power, double accumulator) {
        if (power == 0) {
            return accumulator;
        } else {
            return optmizedBaseToPower(base,
                                power - 1,
                            accumulator * base);
        }
    }
}
