package com.rakovets.course.java.core.practice.oop_classes_and_objects;

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

    public int getNumberBanknotes20() {
        return this.numberBanknotes20;
    }

    public int getNumberBanknotes50() {
        return this.numberBanknotes50;
    }

    public int getNumberBanknotes100() {
        return this.numberBanknotes100;
    }

    public void addBanknotes20(int number) {
        this.numberBanknotes20 = number;
    }

    public void addBanknotes50(int number) {
        this.numberBanknotes50 = number;
    }

    public void addBanknotes100(int number) {
        this.numberBanknotes100 = number;
    }

    public boolean isPossibleIssue(int amount) {
        if (amount > getTotalMoneyInATM()) {
            return false;
        }
        if (amount >= DENOMINATION_OF_BANKNOTES_100) {
            amount -= amount % 100;
        }
        if (amount >= DENOMINATION_OF_BANKNOTES_50) {
            amount -= amount % 50;
        }
        if (amount >= DENOMINATION_OF_BANKNOTES_20) {
            amount -= amount % 20;
        }
        return amount == 0;
    }

    private int getTotalMoneyInATM() {
        return numberBanknotes20 * DENOMINATION_OF_BANKNOTES_20 +
                numberBanknotes50 * DENOMINATION_OF_BANKNOTES_50 +
                numberBanknotes100 * DENOMINATION_OF_BANKNOTES_100;
    }
}
