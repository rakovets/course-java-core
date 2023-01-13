package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private final int numberBanknotes20;
    private final int numberBanknotes50;
    private final int numberBanknotes100;
    private int amount;
    private final int banknote20 = Integer.parseInt(Banknotes.TWENTY.getBanknote());
    private final int banknote50 = Integer.parseInt(Banknotes.FIFTY.getBanknote());
    private final int banknote100 = Integer.parseInt(Banknotes.ONE_HUNDRED.getBanknote());


    Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public boolean isPossibleIssue(int amount) {
        this.amount = amount;
        if (amount > getAllAtmMoney()) {
            return false;
        }
        checkBanknotes(banknote100);
        checkBanknotes(banknote50);
        checkBanknotes(banknote20);
        return this.amount == 0;
    }

    private int getAllAtmMoney() {
        return numberBanknotes20 * banknote20 +
                numberBanknotes50 * banknote50 +
                numberBanknotes100 * banknote100;
    }

    private void checkBanknotes(int banknoteNominal) {
        if (amount >= banknoteNominal) {
            this.amount = amount % banknoteNominal;
        }
    }
}
