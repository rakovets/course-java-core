package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import java.util.Arrays;

public class Atm {

    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    private final int DENOMINATION_OF_BANKNOTES_20 = 20;
    private final int DENOMINATION_OF_BANKNOTES_50 = 50;
    private final int DENOMINATION_OF_BANKNOTES_100 = 100;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public boolean isPossibleIssue(int amount) {
        return amount <= getTotalMoneyInAtm() && withdrawMoneyFromAtm(amount) != 0;
    }

    private int withdrawMoneyFromAtm(int amount) {
        int counter = 0;
        for (int i = 0; i <= numberBanknotes100; i++) {
            for (int j = 0; j <= numberBanknotes50; j++) {
                for (int k = 0; k <= numberBanknotes20; k++) {
                    if (i * DENOMINATION_OF_BANKNOTES_100 + j * DENOMINATION_OF_BANKNOTES_50 +
                            k * DENOMINATION_OF_BANKNOTES_20 == amount) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    public void printAllWithdrawalOptions(int amount) {
        int length = withdrawMoneyFromAtm(amount);
        int counter = 0;
        int[][] combinations = new int[length][3];
        for (int i = 0; i <= numberBanknotes100; i++) {
            for (int j = 0; j <= numberBanknotes50; j++) {
                for (int k = 0; k <= numberBanknotes20; k++) {
                    if (i * DENOMINATION_OF_BANKNOTES_100 + j * DENOMINATION_OF_BANKNOTES_50 +
                            k * DENOMINATION_OF_BANKNOTES_20 == amount) {
                        combinations[counter][0] = i;
                        combinations[counter][1] = j;
                        combinations[counter][2] = k;
                        counter++;
                    }
                }
            }
        }
        System.out.printf("%s, %s, %s  banknotes in ATM \n", 100, 50, 20);
        for (int[] ints : combinations) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public int getTotalMoneyInAtm() {
        return numberBanknotes20 * DENOMINATION_OF_BANKNOTES_20 +
                numberBanknotes50 * DENOMINATION_OF_BANKNOTES_50 +
                numberBanknotes100 * DENOMINATION_OF_BANKNOTES_100;
    }

    public int getNumberBanknotes20() {
        return numberBanknotes20;
    }

    public int getNumberBanknotes50() {
        return numberBanknotes50;
    }

    public int getNumberBanknotes100() {
        return numberBanknotes100;
    }

    public void addBanknotes20(int number) {
        this.numberBanknotes20 += number;
    }

    public void addBanknotes50(int number) {
        this.numberBanknotes50 += number;
    }

    public void addBanknotes100(int number) {
        this.numberBanknotes100 += number;
    }
}
