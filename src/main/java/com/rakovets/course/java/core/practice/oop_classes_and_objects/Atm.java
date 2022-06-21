package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    final int BANKNOTE_20 = 20;
    final int BANKNOTE_50 = 50;
    final int BANKNOTE_100 = 100;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    /**
     * Enters the received amount of banknotes into the ATM.
     *
     * @param number number of banknotes.
     */
    public void addBanknotes100(int number) {
        this.numberBanknotes100 += number;
    }

    /**
     * Enters the received amount of banknotes into the ATM.
     *
     * @param number number of banknotes.
     */
    public void addBanknotes50(int number) {
        this.numberBanknotes50 += number;
    }

    /**
     * Enters the received amount of banknotes into the ATM.
     *
     * @param number number of banknotes.
     */
    public void addBanknotes20(int number) {
        this.numberBanknotes20 += number;
    }

    /**
     * Checks if it is possible to issue the amount requested by the client.
     *
     * @param amount requested amount.
     */
    public boolean isPossibleIssue(int amount) {
        for (int i = 0; i <= numberBanknotes100; i++) {
            for (int j = 0; j <= numberBanknotes50; j++) {
                for (int k = 0; k <= numberBanknotes20; k++) {
                    if (BANKNOTE_100 * i + BANKNOTE_50 * j + BANKNOTE_20 * k == amount) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Displays text based on results.
     *
     * @param finishedResult result.
     */
    public String displaysATextAboutThePossibilityOfWithdrawingMoneyFromAnATM(boolean finishedResult) {
        String displayText;

        if (finishedResult) {
            displayText = "Requested amount available.";
        } else {
            displayText = "Requested amount not available.";
        }
        return displayText;
    }

    public String getOptionsCombinationBanknotes(int amount) {
        int option = 0;

        StringBuilder options = new StringBuilder();

        for (int i = 0; i <= numberBanknotes100 && i * BANKNOTE_100 <= amount; i++) {
            for (int j = 0; j <= numberBanknotes50 && j * BANKNOTE_50 <= amount; j++) {
                for (int k = 0; k <= numberBanknotes20 && k * BANKNOTE_20 <= amount; k++) {
                    if (i * BANKNOTE_100 + j * BANKNOTE_50 + k * BANKNOTE_20 == amount) {
                        option++;
                        options.append(option)
                                .append(": ")
                                .append("100 - ")
                                .append(i).append("\n    50 - ")
                                .append(j).append("\n    20 - ")
                                .append(k).append("\n\n");
                    }
                }
            }
        }
        return options.toString();
    }
}

