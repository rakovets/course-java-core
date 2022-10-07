package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    public int numberBanknotes20;
    public int numberBanknotes50;
    public int numberBanknotes100;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public int addNumberBanknotes20() {
        return numberBanknotes20;
    }

    public int addNumberBanknotes50() {
        return numberBanknotes50;
    }

    public int addNumberBanknotes100() {
        return numberBanknotes100;
    }
}
