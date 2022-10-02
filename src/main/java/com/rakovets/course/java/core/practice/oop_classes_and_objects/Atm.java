package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public int getNumberBanknotes20() {
        return numberBanknotes20;
    }

    public void setNumberBanknotes20(int numberBanknotes20) {
        this.numberBanknotes20 = numberBanknotes20;
    }

    public int getNumberBanknotes50() {
        return numberBanknotes50;
    }

    public void setNumberBanknotes50(int numberBanknotes50) {
        this.numberBanknotes50 = numberBanknotes50;
    }

    public int getNumberBanknotes100() {
        return numberBanknotes100;
    }

    public void setNumberBanknotes100(int numberBanknotes100) {
        this.numberBanknotes100 = numberBanknotes100;
    }

    public int addBanknotes20(int number) {
        return numberBanknotes20 += number;
    }

    public int addBanknotes50(int number) {
        return numberBanknotes50 += number;
    }

    public int addBanknotes100(int number) {
        return numberBanknotes100 += number;
    }
    public boolean isPossibleIssue(int amount) {
        int amountBanknotes20 = getNumberBanknotes20();
        int amountBanknotes50 = getNumberBanknotes50();
        int amountBanknotes100 = getNumberBanknotes100();
        final int BANKNOTES20 = 20;
        final int BANKNOTES50 = 50;
        final int BANKNOTES100 = 100;
        boolean checkAmount;
        int totalSum = BANKNOTES20 * getNumberBanknotes20() + BANKNOTES50 * getNumberBanknotes50() + BANKNOTES100 * getNumberBanknotes100();
        if (totalSum < amount || amount % 10 != 0 || amount == 0) {
            checkAmount = false;
        } else {
            if (amount > 0 && amountBanknotes100 > 0) {
                amount -= BANKNOTES100;
                amountBanknotes100--;
            } else if (amountBanknotes100 == 0 && amountBanknotes50 > 0) {
                while (amount > 0 && amountBanknotes50 > 0) {
                    amount -= BANKNOTES50;
                    amountBanknotes50--;
                }
            } else {
                while (amount > 0 && amountBanknotes20 > 0) {
                    amount -= BANKNOTES20;
                    amountBanknotes20--;
                }
            }
            checkAmount = true;
        }
        return checkAmount;
    }
}
