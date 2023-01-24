package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private final int numberBanknotes20;
    private final int numberBanknotes50;
    private final int numberBanknotes100;
    private final int banknote20 = Banknotes.TWENTY.getBanknote();
    private final int banknote50 = Banknotes.FIFTY.getBanknote();
    private final int banknote100 = Banknotes.ONE_HUNDRED.getBanknote();

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public boolean isPossibleIssue(int amount) {
        if (amount > getAllAtmMoney()) {
            return false;
        }
        return numberBanknotes20 % numberBanknotes50 % numberBanknotes100 == 0;
    }

    private int getAllAtmMoney() {
        return numberBanknotes20 * banknote20 +
                numberBanknotes50 * banknote50 +
                numberBanknotes100 * banknote100;
    }
}
