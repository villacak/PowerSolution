package com.excercise.power;

import com.excercise.power.recursive.BaseToPower;
import com.excercise.power.recursive.AbstractBaseToPower;
import com.excercise.power.recursive.BaseToPowerOptmized;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Solution for the power code test that I did in one interview");

        final double TEMP_BASE = 2D;
        final int FIRST_CASE_POWER = 3;
        final int SECOND_CASE_POWER = 10;

        AbstractBaseToPower btp = new BaseToPower();

        //
        // Fist way looping O(N), where N is case is the power value
        //
        System.out.println("Looping through");
        final double firstResult = btp.baseToPower(TEMP_BASE, FIRST_CASE_POWER);
        System.out.println("Base= 2, power = 3, result " + firstResult);

        final double secondResult = btp.baseToPower(TEMP_BASE, SECOND_CASE_POWER);
        System.out.println("Base= 2, power = 8, result " + secondResult + "\n");

        //
        // Last Option, more optimized
        //
        System.out.println("Completely recursive");
        btp = new BaseToPowerOptmized();
        final double fifthResult = btp.baseToPower(TEMP_BASE, FIRST_CASE_POWER);
        System.out.println("Base= 2, power = 3, result " + fifthResult);

        final double sixthResult = btp.baseToPower(TEMP_BASE, SECOND_CASE_POWER);
        System.out.println("Base= 2, power = 8, result " + sixthResult + "\n");

        //
        // Using pow
        //
        System.out.println("Using Math.pow");
        System.out.println("Base= 2, power = 3, result " + Math.pow(TEMP_BASE, FIRST_CASE_POWER));
        System.out.println("Base= 2, power = 8, result " + Math.pow(TEMP_BASE, SECOND_CASE_POWER));
    }
}