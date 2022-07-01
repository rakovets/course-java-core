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
        final int DENOMINATION_BANKNOTE_20 = 20;
        final int DENOMINATION_BANKNOTE_50 = 50;
        final int DENOMINATION_BANKNOTE_100 = 100;

        int amountAllBanknotes;
        boolean check;

        amountAllBanknotes = numberBanknotes20 * DENOMINATION_BANKNOTE_20 + numberBanknotes50 * DENOMINATION_BANKNOTE_50 + numberBanknotes100 * DENOMINATION_BANKNOTE_100;
        if (amountAllBanknotes < amount || amount % 10 != 0 || amount == 0) {
            check = false;
        } else {
            while (amount > 0 && numberBanknotes100 > 0) {
                amount -= DENOMINATION_BANKNOTE_100;
                numberBanknotes100--;
            }
            if (amount < 0) {
                amount += DENOMINATION_BANKNOTE_100;
                numberBanknotes100++;
            }
            while (amount > 0 && numberBanknotes50 > 0) {
                amount -= DENOMINATION_BANKNOTE_50;
                numberBanknotes50--;
            }
            if (amount < 0) {
                amount += DENOMINATION_BANKNOTE_50;
               numberBanknotes50++;
            }
            while (amount > 0 && numberBanknotes20 > 0) {
                amount -= DENOMINATION_BANKNOTE_20;
                numberBanknotes20--;
            }
            check = true;
        }
        return check;
    }
//
//    public int getOptionsCombinationBanknotes(int amount) {
//
//    }

//    public void setNumberBanknotes20() {
//        this.numberBanknotes20 = numberBanknotes20;
//    }
}
