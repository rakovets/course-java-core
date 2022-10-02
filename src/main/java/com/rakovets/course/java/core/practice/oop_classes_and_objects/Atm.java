package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    public static void main(String[] args) {

    }
    public int numberBanknotes20;
    public int numberBanknotes50;
    public int numberBanknotes100;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }
    public int addBanknotes20(int number) {
        this.numberBanknotes20 += number;
        return  numberBanknotes20;
    }
    public int addBanknotes50(int number) {
        this.numberBanknotes50 += number;
        return numberBanknotes50;
    }
    public int addBanknotes100(int number) {
        this.numberBanknotes100 += number;
        return numberBanknotes100;
    }
}
