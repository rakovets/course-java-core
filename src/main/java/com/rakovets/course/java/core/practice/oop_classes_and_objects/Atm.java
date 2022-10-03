package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;
    private int totalamoung= numberBanknotes20 * 20 + numberBanknotes50 * 50 + numberBanknotes100 * 100;
    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = 20;
        this.numberBanknotes50 = 50;
        this.numberBanknotes100 = 100;
    }
    public int addBanknotes20(int numberBanknotes20) {
        this.numberBanknotes20 += this.numberBanknotes20;
        return this.numberBanknotes20;
    }
    public int addBanknotes50(int numberBanknotes50) {
        this.numberBanknotes50 += numberBanknotes50;
        return this.numberBanknotes50;
    }
    public int addBanknotes100(int number) {
        this.numberBanknotes100 += numberBanknotes100;
        return this.numberBanknotes100;
    }
    public boolean isPossibleIssue(int amount) {
        return amount <= totalamoung;
    }
    }

