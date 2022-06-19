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

    public int addBanknotes20(int amountAddBanknotes20) {
        this.numberBanknotes20 += amountAddBanknotes20;
        return this.numberBanknotes20;
    }

    public int addBanknotes50(int amountAddBanknotes50) {
        this.numberBanknotes50 += amountAddBanknotes50;
        return this.numberBanknotes50;
    }

    public int addBanknotes100(int amountAddBanknotes100) {
        this.numberBanknotes100 += amountAddBanknotes100;
        return this.numberBanknotes100;
    }
}
