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

    public void addBanknotes20(int number) {
        numberBanknotes20 += number;
    }

    public void addBanknotes50(int number) {
        numberBanknotes50 += number;
    }

    public void addBanknotes100(int number) {
        numberBanknotes100 += number;
    }

    public int getNumberBanknotes20() {
        return numberBanknotes20;
    }

    public void setNumberBanknotes20(int numberBanknotes20) {
        this.numberBanknotes20 = numberBanknotes20;
    }

    public int getNumberBanknotes50() {
        return numberBanknotes50;
    }

    public void setNumberBanknotes50(int numberBanknotes50) {
        this.numberBanknotes50 = numberBanknotes50;
    }

    public int getNumberBanknotes100() {
        return numberBanknotes100;
    }

    public void setNumberBanknotes100(int numberBanknotes100) {
        this.numberBanknotes100 = numberBanknotes100;
    }
}
