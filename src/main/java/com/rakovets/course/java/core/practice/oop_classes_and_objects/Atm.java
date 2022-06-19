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
        this.numberBanknotes20 += number;
    }

    public void addBanknotes50(int number) {
        this.numberBanknotes50 += number;
    }

    public void addBanknotes100(int number) {
        this.numberBanknotes100 += number;
    }

    public boolean isPossibleIssue(int amount) {
        boolean isPossibleIssue = false;
        int totalMoneyBanknotes20 = this.numberBanknotes20 * 20;
        int totalMoneyBanknotes50 = this.numberBanknotes50 * 50;
        int totalMoneyBanknotes100 = this.numberBanknotes100 * 100;
        int allMoneyInAtm = totalMoneyBanknotes20 + totalMoneyBanknotes50 + totalMoneyBanknotes100;
        if (allMoneyInAtm >= amount && amount >= 20 && amount % 10 == 0 ) {
            switch (amount % 100) {
                case 0:
                    isPossibleIssue = true;
                    break;
                case 10:
                    isPossibleIssue = (this.numberBanknotes20 >= 3 && this.numberBanknotes50 >= 1);
                    break;
                case 20:
                    isPossibleIssue = this.numberBanknotes20 >= 1;
                    break;
                case 30:
                    isPossibleIssue = (this.numberBanknotes20 >= 4 && this.numberBanknotes50 >= 1);
                    break;
                case 40:
                    isPossibleIssue = this.numberBanknotes20 >= 2;
                    break;
                case 50:
                    isPossibleIssue = this.numberBanknotes50 >= 1;
                    break;
                case 60:
                    isPossibleIssue = this.numberBanknotes20 >= 3;
                    break;
                case 70:
                    isPossibleIssue = (this.numberBanknotes20 >= 1 && this.numberBanknotes50 >= 1);
                    break;
                case 80:
                    isPossibleIssue = this.numberBanknotes20 >= 4;
                    break;
                case 90:
                    isPossibleIssue = (this.numberBanknotes20 >= 2 && this.numberBanknotes50 >= 1);
                    break;
            }
        }
        return isPossibleIssue;
    }
}
