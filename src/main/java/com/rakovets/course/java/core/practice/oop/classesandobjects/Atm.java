package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Atm {
    private int numberBanknotes100;
    private int numberBanknotes50;
    private int numberBanknotes20;

    Atm(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        if (numberBanknotes100 >= 0) {
            this.numberBanknotes100 = numberBanknotes100;
        }
        if (numberBanknotes50 >= 0) {
            this.numberBanknotes50 = numberBanknotes50;
        }
        if (numberBanknotes20 >= 0) {
            this.numberBanknotes20 = numberBanknotes20;
        }
    }

    public void addBanknotes100(int number) {
        if (number > 0) {
            this.numberBanknotes100 += number;
        }
    }
    public void addBanknotes50(int number) {
        if (number > 0) {
            this.numberBanknotes50 += number;
        }
    }
    public void addBanknotes20(int number) {
        if (number > 0) {
            this.numberBanknotes20 += number;
        }
    }
    public boolean isPossibleIssue(int amount) {
        boolean possibleIssue = false;
        if (amount <= (this.numberBanknotes100 * 100 + this.numberBanknotes50 * 50 + this.numberBanknotes20 * 20) && amount > 0) {
            for (int a = 0; a <= this.numberBanknotes100; a++) {
                for (int b = 0; b <= this.numberBanknotes50; b++) {
                    for (int c = 0; c <= this.numberBanknotes20; c++) {
                        if (a * 100 + b * 50 + c * 20 == amount) {
                            possibleIssue = true;
                            break;
                        }
                    }
                }
            }
        }
        return possibleIssue;
    }

    public String[] getOptionsCombinationBanknotes(int amount) {
        String optionsCombination = "";

        if (isPossibleIssue(amount)) {
            for (int a = 0; a <= this.numberBanknotes100; a++) {
                for (int b = 0; b <= this.numberBanknotes50; b++) {
                    for (int c = 0; c <= this.numberBanknotes20; c++) {
                        if (a * 100 + b * 50 + c * 20 == amount) {
                            String combinationCase = a + "*100BYN, " + b + "*50BYN, " + c + "*20BYN\n";
                            optionsCombination = optionsCombination.concat(combinationCase);
                        }
                    }
                }
            }
        }
        return optionsCombination.split("\n");
    }

    public void getCash (String option) {
        for (int a = 0; a <= this.numberBanknotes100; a++) {
             for (int b = 0; b <= this.numberBanknotes50; b++) {
                for (int c = 0; c <= this.numberBanknotes20; c++) {
                   String optionsChecking = a + "*100BYN, " + b + "*50BYN, " + c + "*20BYN";
                   if (optionsChecking.equals(option)) {
                       this.numberBanknotes100 -= a;
                       this.numberBanknotes50 -= b;
                       this.numberBanknotes20 -= c;
                   }
                }
             }
        }
    }
}

