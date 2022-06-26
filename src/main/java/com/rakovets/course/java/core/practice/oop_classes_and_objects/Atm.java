package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;
    public static final int BANKNOTES20 = 20;
    public static final int BANKNOTES50 = 50;
    public static final int BANKNOTES100 = 100;
    private int amountCustomer;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public void addBanknotes20(int numberBanknotes20) {
        this.numberBanknotes20 += numberBanknotes20;
    }

    public void setNumberBanknotes20(int numberBanknotes20) {
        this.numberBanknotes20 = numberBanknotes20;
    }

    public int getNumberBanknotes20() {
        return this.numberBanknotes20;
    }

    public void addBanknotes50(int numberBanknotes50) {
        this.numberBanknotes50 += numberBanknotes50;
    }

    public void addBanknotes100(int numberBanknotes100) {
        this.numberBanknotes100 += numberBanknotes100;
    }

    public Atm(int amountCustomer) {
        this.amountCustomer = amountCustomer;
    }

    public void getIsPossibleIssue(int amount) {
        int amountBanknotes20 = this.numberBanknotes20 * BANKNOTES20;
        int amountBanknotes50 = this.numberBanknotes50 * BANKNOTES50;
        int amountBanknotes100 = this.numberBanknotes100 * BANKNOTES100;
        int allMoneyInAtm = amountBanknotes20 + amountBanknotes50 + amountBanknotes100;
    }
}
