package com.rakovets.course.java.core.practice.oop.classes_and_objects;

import java.util.Arrays;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;
    private int[][] arrayWithOptions = new int[0][3];

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public void addBanknotes20(int number) {
        numberBanknotes20 += number;
    }

    public void addBanknotes50(int number) {
        numberBanknotes50 += number;
    }

    public void addBanknotes100(int number) {
        numberBanknotes100 += number;
    }

    public boolean isPossibleIssue(int amount) {
        return getOptionsCombinationBanknotes(amount).length >= 1;
    }

    public int[][] createArray(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        int[][] save = Arrays.copyOf(arrayWithOptions, arrayWithOptions.length);
        arrayWithOptions = Arrays.copyOf(save, save.length + 1);
        arrayWithOptions[arrayWithOptions.length - 1] = new int[]{numberBanknotes20, numberBanknotes50, numberBanknotes100};
        return arrayWithOptions;
    }

    public int[][] getOptionsCombinationBanknotes(int amount) {
        arrayWithOptions = new int[0][3];

        for (int i = 0; i <= numberBanknotes20; i++) {
            for (int j = 0; j <= numberBanknotes50; j++) {
                for (int x = 0; x <= numberBanknotes100; x++) {
                    if (i * 20 + j * 50 + x * 100 == amount) {
                        createArray(i, j, x);
                    }
                }
            }
        }
        return arrayWithOptions;
    }

    public int getCash(int[] variant) {
        int sumOfMoney = 20 * variant[0] + 50 * variant[1] + 100 * variant[2];

        if (isPossibleIssue(sumOfMoney)) {
            numberBanknotes20 -= variant[0];
            numberBanknotes50 -= variant[1];
            numberBanknotes100 -= variant[2];
        }
        return sumOfMoney;
    }
}
