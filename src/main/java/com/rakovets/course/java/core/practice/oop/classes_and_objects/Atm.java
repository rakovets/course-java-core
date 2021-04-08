package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;
    final int banknote20 = 20;
    final int banknote50 = 50;
    final int banknote100 = 100;


    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }
//    public Atm(int amountBanknotes) {
//        this.numberBanknotes100 += amountBanknotes / banknote100;
//        this.numberBanknotes50 += amountBanknotes % banknote100 / banknote50;
//        this.numberBanknotes20 += amountBanknotes % banknote100 % banknote50 / banknote20;
//    }
    public int addBanknotes20(int numberBanknotes20) {
        int i = 0;
        while (numberBanknotes20 > i) {
            i++;
        }
        return this.numberBanknotes20 + numberBanknotes20;
    }
    public int addBanknotes50(int numberBanknotes50) {
        int i = 0;
        while (numberBanknotes50 > i) {
            i++;
        }
        return this.numberBanknotes50 + numberBanknotes50;
    }
    public int addBanknotes100(int numberBanknotes100) {
        int i = 0;
        while (numberBanknotes100 > i) {
            i++;
        }
        return this.numberBanknotes100 + numberBanknotes100;
    }
    public int isPossibleIssue(int requestedAmount) {
        int sumBanknotes = numberBanknotes20 * banknote20 + numberBanknotes50 * banknote50 + numberBanknotes100 * banknote100;
        if (requestedAmount <= sumBanknotes) {
            sumBanknotes = sumBanknotes - requestedAmount;
            this.numberBanknotes100 = sumBanknotes / banknote100;
            this.numberBanknotes50 = sumBanknotes % banknote100 / banknote50;
            this.numberBanknotes20 = sumBanknotes % banknote100 % banknote50 / banknote20;
            System.out.println("\nTake your money");
        } else {
            System.out.println("\nNot enough money ATM");
        }
        return requestedAmount;
    }
    public String getOptionsCombinationBanknotes(int requestedAmount) {
        String combinations = "";
        for (int i = 0; numberBanknotes20 <= requestedAmount / banknote20; i++) {
            for (int j = 0; numberBanknotes50 <= requestedAmount / banknote50; j++) {
                for (int k = 0; numberBanknotes100 <= requestedAmount / banknote100; k++) {
                    if (requestedAmount == i * banknote20 + j * banknote50 + k * banknote100) {
                        combinations = i + ";" + j + ";" + k;
                    }
                }
            }
        }
        return combinations;
    }
}
