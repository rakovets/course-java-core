package com.rakovets.course.java.core.practice.oop_classes_and_objects.task_4;

public class Atm {
    int numberBanknotes20;
    int numberBanknotes50;
    int numberBanknotes100;

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

    public void setNumberBanknotes20(int numberBanknotes20) {
        this.numberBanknotes20 = numberBanknotes20;
    }

    public void setNumberBanknotes50(int numberBanknotes50) {
        this.numberBanknotes50 = numberBanknotes50;
    }

    public void setNumberBanknotes100(int numberBanknotes100) {
        this.numberBanknotes100 = numberBanknotes100;
    }

    //не работает
    public String isPossibleIssue(int amount) {
        String PossibleIssue;
        if (amount % 20 == 0 || amount % 50 == 0 || amount % 100 == 0) {
            PossibleIssue = "It's possible";
        } PossibleIssue  = "It's impossible";
        return PossibleIssue;
    }
}
