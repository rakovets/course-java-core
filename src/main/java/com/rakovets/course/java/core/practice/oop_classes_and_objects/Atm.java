package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int NumberBanknotes50;
    private int NumberBanknotes100;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        NumberBanknotes50 = numberBanknotes50;
        NumberBanknotes100 = numberBanknotes100;
    }

    public int getNumberBanknotes20() {
        return numberBanknotes20;
    }

    public void addBanknotes20(int numberBanknotes20) {
        this.numberBanknotes20 += numberBanknotes20;
    }

    public int getNumberBanknotes50() {
        return NumberBanknotes50;
    }

    public void addBanknotes50(int numberBanknotes50) {
        NumberBanknotes50 += numberBanknotes50;
    }

    public int getNumberBanknotes100() {
        return NumberBanknotes100;
    }

    public void addBanknotes100(int numberBanknotes100) {
        NumberBanknotes100 += numberBanknotes100;
    }
}
