package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;
    private static final int DENOM20 = 20;
    private static final int DENOM50 = 50;
    private static final int DENOM100 = 100;


    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public void addBanknotes20(int newNumberBanknotes20) {
        this.numberBanknotes20 += newNumberBanknotes20;

    }

    public void addBanknotes50(int newNumberBanknotes50) {
        this.numberBanknotes50 += newNumberBanknotes50;
    }

    public void addBanknotes100(int newNumberBanknotes100) {
        this.numberBanknotes100 += newNumberBanknotes100;
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

    public boolean isPossibleIssue(int clientAmount) {
        if (clientAmount == 0) {
            return true;
        }
        boolean result = false;
        if (clientAmount >= DENOM100 && numberBanknotes100 >= 1) {
            this.numberBanknotes100--;
            result = isPossibleIssue(clientAmount - DENOM100);
            if (result) {
                return result;
            }
            this.numberBanknotes100++;
        }

        if (clientAmount >= DENOM50 && numberBanknotes50 >= 1) {
            this.numberBanknotes50--;
            result = isPossibleIssue(clientAmount - DENOM50);
            if (result) {
                return result;
            }
            this.numberBanknotes50++;
        }

        if (clientAmount >= DENOM20 && numberBanknotes20 >= 1) {
            this.numberBanknotes20--;
            result = isPossibleIssue(clientAmount - DENOM20);
            if (result) {
                return result;
            }
            this.numberBanknotes20++;
        }
        return result;
    }
}
