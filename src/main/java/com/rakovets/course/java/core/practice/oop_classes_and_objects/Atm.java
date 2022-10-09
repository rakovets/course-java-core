package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    final int VALUE_BANKNOTES_20 = 20;
    final int VALUE_BANKNOTES_50 = 50;
    final int VALUE_BANKNOTES_100 = 100;

    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;
    private int currentIssueAmount;

    {
        currentIssueAmount = 0;
    }

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public void addBanknotes20(int numberBanknotes20) {
        this.numberBanknotes20 += numberBanknotes20;
    }

    public void addBanknotes50(int numberBanknotes50) {
        this.numberBanknotes50 += numberBanknotes50;
    }

    public void addBanknotes100(int numberBanknotes100) {
        this.numberBanknotes100 += numberBanknotes100;
    }

    public int getNumberBanknotes20() {
        return this.numberBanknotes20;
    }

    public int getNumberBanknotes50() {
        return this.numberBanknotes50;
    }

    public int getNumberBanknotes100() {
        return this.numberBanknotes100;
    }

    public int getCurrentIssueAmount() {
        return this.currentIssueAmount;
    }

    public boolean isPossibleIssue(int amount) {
        boolean isPossibleIssue = false;
        int totalAmountInAtm = numberBanknotes20 * VALUE_BANKNOTES_20 + numberBanknotes50 * VALUE_BANKNOTES_50 + numberBanknotes100 * VALUE_BANKNOTES_100;
        if (amount > 0 && amount < totalAmountInAtm) {
            for (int i = 0; i <= (amount / VALUE_BANKNOTES_100) && i <= numberBanknotes100; i++) {
                for (int j = 0; j <= (amount / VALUE_BANKNOTES_50) && j <= numberBanknotes50; j++) {
                    for (int k = 0; k <= (amount / VALUE_BANKNOTES_20) && k <= numberBanknotes20; k++) {
                        if (amount == k * VALUE_BANKNOTES_20 + j * VALUE_BANKNOTES_50 + i * VALUE_BANKNOTES_100) {
                            isPossibleIssue = true;
                            break;
                        }
                    }
                }
            }
        } else if (amount == totalAmountInAtm) {
            isPossibleIssue = true;
        }
        if (isPossibleIssue) {
            currentIssueAmount = amount;
        }
        return isPossibleIssue;
    }

    public int[][] getOptionsCombinationBanknotes(int amount) {
        int totalNumberOfOptions = 0;
        int[][] optionsCombinationBanknotes;
        /* it's much better to use dynamic list of arrays in this case, but we
        haven't learned this type of objects yet and therefor I use static 2D array */
        for (int i = 0; i <= amount / VALUE_BANKNOTES_100 && i <= numberBanknotes100; i++) {
            for (int j = 0; j <= amount / VALUE_BANKNOTES_50 && j <= numberBanknotes50; j++) {
                for (int k = 0; k <= amount / VALUE_BANKNOTES_20 && k <= numberBanknotes20; k++) {
                    if (amount == k * VALUE_BANKNOTES_20 + j * VALUE_BANKNOTES_50 + i * VALUE_BANKNOTES_100) {
                            totalNumberOfOptions += 1;
                    }
                }
            }
        }
        if (totalNumberOfOptions > 0) {
            optionsCombinationBanknotes = new int[totalNumberOfOptions][3];
            int numberOfOptions = 0;
            for (int i = 0; i <= amount / VALUE_BANKNOTES_100 && i <= numberBanknotes100; i++) {
                for (int j = 0; j <= amount / VALUE_BANKNOTES_50 && j <= numberBanknotes50; j++) {
                    for (int k = 0; k <= amount / VALUE_BANKNOTES_20 && k <= numberBanknotes20; k++) {
                        if (amount == k * VALUE_BANKNOTES_20 + j * VALUE_BANKNOTES_50 + i * VALUE_BANKNOTES_100) {
                            optionsCombinationBanknotes[numberOfOptions][0] = k;
                            optionsCombinationBanknotes[numberOfOptions][1] = j;
                            optionsCombinationBanknotes[numberOfOptions][2] = i;
                            numberOfOptions++;
                        }
                    }
                }
            }
        } else {
            optionsCombinationBanknotes = new int[1][3];
        }
        return optionsCombinationBanknotes;
    }

    public int[] getCash(int number) {
        int[][] optionsOfCombinations = this.getOptionsCombinationBanknotes(currentIssueAmount);
        int[] chosenOption = new int[optionsOfCombinations[0].length];
        for (int i = 0; i < optionsOfCombinations[0].length; i++) {
            chosenOption[i] = optionsOfCombinations[number-1][i];
        }
        numberBanknotes20 -= chosenOption[0];
        numberBanknotes50 -= chosenOption[1];
        numberBanknotes100 -= chosenOption[2];
        currentIssueAmount = 0;
        return chosenOption;
    }
}

