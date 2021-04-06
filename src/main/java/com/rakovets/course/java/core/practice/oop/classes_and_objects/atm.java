package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    public void Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100){
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }
    public int addBanknotes20(int number){
        this.numberBanknotes20 += number;
        return numberBanknotes20;
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
