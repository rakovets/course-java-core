package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    public int numberBanknotes20;
    public int numberBanknotes50;
    public int numberBanknotes100;

    public Atm (int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public int getNumberBanknotes20() {
        return numberBanknotes20;
    }

    public void addBanknotes20(int number) {
        this.numberBanknotes20 = numberBanknotes20 + number;
    }

    public int getNumberBanknotes50() {
        return numberBanknotes50;
    }

    public void addBanknotes50(int number) {
        this.numberBanknotes50 = numberBanknotes50 + number;
    }

    public int getNumberBanknotes100() {
        return numberBanknotes50;
    }

    public void addBanknotes100(int number) {
        this.numberBanknotes100 = numberBanknotes100 + number;
    }
}
