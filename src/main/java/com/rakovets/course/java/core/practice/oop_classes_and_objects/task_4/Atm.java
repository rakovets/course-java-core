package com.rakovets.course.java.core.practice.oop_classes_and_objects.task_4;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    public Atm(int banknotes20, int banknotes50, int banknotes100) {
        this.numberBanknotes20 = banknotes20;
        this.numberBanknotes50 = banknotes50;
        this.numberBanknotes100 = banknotes100;
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
    public void addNumberBanknotes20(int num) {
        this.numberBanknotes20 += num;
    }
    public void addNumberBanknotes50(int num) {
        this.numberBanknotes50 += num;
    }
    public void addNumberBanknotes100(int num) {
        this.numberBanknotes100 += num;
    }
    public boolean isPossibleIssue(int amount) {
        boolean result;
        if (amount % 20 == 0 || amount % 50 == 0 || amount % 100 == 0) {
            result = true;
        } else
            result = false;
        return result;
    }
}
