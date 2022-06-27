package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int NumberBanknotes50;
    private int NumberBanknotes100;

    public Atm (int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.NumberBanknotes50 = numberBanknotes50;
        this.NumberBanknotes100 = numberBanknotes100;
    }

    public void addBanknotes20 (int x) {
        this.numberBanknotes20 += x;
    }

    public void addBanknotes50 (int x) {
        this.NumberBanknotes50 += x;
    }

    public void addBanknotes100 (int x) {
        this.NumberBanknotes100 += x;
    }

    public int getNumberBanknotes20() {
        return this.numberBanknotes20;
    }

    public int getNumberBanknotes50() {
        return this.NumberBanknotes50;
    }

    public int getNumberBanknotes100() {
        return this.NumberBanknotes100;
    }
}
