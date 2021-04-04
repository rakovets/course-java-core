package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    public Atm (int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
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
        int amountBanknotes20 = numberBanknotes20;
        int amountBanknotes50 = numberBanknotes50;
        int amountBanknotes100 = numberBanknotes100;
        int banknotes20 = 20;
        int banknotes50 = 50;
        int banknotes100 = 100;
        int amountAllBanknotes = banknotes20 * amountBanknotes20 + banknotes50 * amountBanknotes50
                + banknotes100 * amountBanknotes100;
        boolean check;

        System.out.println("Amount all banknotes: " + amountAllBanknotes + " BYN");
        if (amountAllBanknotes < amount || amount % 10 != 0 || amount == 0) {
            check = false;
        } else {
            while (amount > 0 && amountBanknotes100 > 0) {
                amount -= banknotes100;
                amountBanknotes100--;
            }
            if (amount < 0) {
                amount += banknotes100;
                amountBanknotes100++;
            }
            while (amount > 0 && amountBanknotes50 > 0) {
                amount -= banknotes50;
                amountBanknotes50--;
            }
            if (amount < 0) {
                amount += banknotes50;
                amountBanknotes50++;
            }
            while (amount > 0 && amountBanknotes20 > 0) {
                amount -= banknotes20;
                amountBanknotes20--;
            }
            check = true;
        }
        return check;
    }
    public getOptionsCombinationBanknotes (int amount) {
    }
}
