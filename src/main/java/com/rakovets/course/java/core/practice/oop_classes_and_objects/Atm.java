package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;
    private final int DENOMINATION_BANKNOTE_20 = 20;
    private final int DENOMINATION_BANKNOTE_50 = 50;
    private final int DENOMINATION_BANKNOTE_100 = 100;
    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
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
        this.numberBanknotes20 = number;
    }

    public void addBanknotes50(int number) {
        this.numberBanknotes50 = number;
    }

    public void addBanknotes100(int number) {
        this.numberBanknotes100 = number;
    }
    public boolean isPossibleIssue(int amount) {
        int amountInATM = numberBanknotes20 * DENOMINATION_BANKNOTE_20 + numberBanknotes50 * DENOMINATION_BANKNOTE_50 + numberBanknotes100 * DENOMINATION_BANKNOTE_100;
        boolean result = amount < amountInATM ? true : false;
        return result;
    }
    /* public int getOptionsCombinationBanknotes(int amount) {
        int totalBanknotes100 = amount / DENOMINATION_BANKNOTE_100;
        int totalBanknotes50 = amount / DENOMINATION_BANKNOTE_50;
        int totalBanknotes20 = amount / DENOMINATION_BANKNOTE_20;
        return option;
    }
    public int getCash(int option) {
        return option;
    } */
}
