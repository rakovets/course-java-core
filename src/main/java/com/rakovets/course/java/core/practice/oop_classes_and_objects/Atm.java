package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private final int numberBanknotes20;
    private final int numberBanknotes50;
    private final int numberBanknotes100;

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

    private void addBanknotes20(int number) {
        this.numberBanknotes20 += number;
    }

    private void addBanknotes50(int number) {
        this.numberBanknotes50 += number;
    }

    private void addBanknotes100(int number) {
        this.numberBanknotes100 += number;
    }
}
