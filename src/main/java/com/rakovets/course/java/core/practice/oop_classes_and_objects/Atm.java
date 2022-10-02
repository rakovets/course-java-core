package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    {
        this.numberBanknotes20 = 0;
        this.numberBanknotes50 = 0;
        this.numberBanknotes100 = 0;
    }

    Atm() {
    }

    Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public void addNumberBanknotes20(int numberBanknotes20) {
        this.numberBanknotes20 += numberBanknotes20;
    }

    public void addNumberBanknotes50(int numberBanknotes50) {
        this.numberBanknotes50 += numberBanknotes50;
    }

    public void addNumberBanknotes100(int numberBanknotes100) {
        this.numberBanknotes100 += numberBanknotes100;
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

    public boolean isPossibleIssue(int amount) {
        int sumOfBanknotes = this.numberBanknotes20 * 20 + this.numberBanknotes50 * 50 + this.numberBanknotes100 * 100;
        boolean isPossible;
        if (amount < 0) {
            return false;
        }
        if (sumOfBanknotes < amount || amount % 10 != 0 || amount == 0) {
            isPossible = false;
        } else {
            while (amount > 0 && numberBanknotes100 > 0) {
                amount -= 100;
                numberBanknotes100--;
            }
            if (amount < 0) {
                amount += 100;
                numberBanknotes100++;
            }
            while (amount > 0 && numberBanknotes50 > 0) {
                amount -= 50;
                numberBanknotes50--;
            }
            if (amount < 0) {
                amount += 50;
                numberBanknotes50++;
            }
            while (amount > 0 && numberBanknotes20 > 0) {
                amount -= 20;
                numberBanknotes20--;
            }
            isPossible = true;
        }
        return isPossible;
    }
}
