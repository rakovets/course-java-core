package com.rakovets.course.java.core.practice.oop.classes_and_objects;

import java.util.ArrayList;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(10, 5, 10);
        int money = 210;

        if (atm.isPossibleIssue(money)) {
            System.out.printf("You can get %d$\n", money);
            int[][] options = atm.getOptionsCombinationBanknotes(money);

            for (int[] l : options) {
                System.out.println("20$ = " + l[0] + " 50$ = " + l[1] + " 100$ = " + l[2]);
            }

            System.out.printf("The money was issued in the amount of %d$", atm.getCash(options[0]));
        }
    }
}

