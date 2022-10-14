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
        return this.numberBanknotes20;
    }

    public int getNumberBanknotes50() {
        return this.numberBanknotes50;
    }

    public int getNumberBanknotes100() {
        return this.numberBanknotes100;
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
        boolean withdrawalPossibility = false;
        final int BANKNOTES20 = 20;
        final int BANKNOTES50 = 50;
        final int BANKNOTES100 = 100;
        int totalAtmSum = BANKNOTES20 * numberBanknotes20 + BANKNOTES50 * numberBanknotes50 + BANKNOTES100 * numberBanknotes100;
        if (amount <= totalAtmSum) {
            withdrawalPossibility = true;
        }
        return withdrawalPossibility;
    }
}
