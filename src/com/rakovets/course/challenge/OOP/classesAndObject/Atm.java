package com.rakovets.course.challenge.OOP.classesAndObject;

public class Atm {

    int numberBanknotes100;
    int numberBanknotes50;
    int numberBanknotes20;

    Atm(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20)
    {
        this.numberBanknotes100 = numberBanknotes100;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes20 = numberBanknotes20;
    }

    Atm()
    {
    }

    public void addBanknotes100(int number)
    {
        numberBanknotes100 += number;
    }

    public void addBanknotes50(int number)
    {
        numberBanknotes50 += number;
    }

    public void addBanknotes20(int number)
    {
        numberBanknotes20 += number;
    }

    public boolean isPossibleIssue(int amount)
    {
        if (amount % 100 % 50 % 20 == 0 && Math.floor(amount / 100) <= numberBanknotes100) {
            return true;
            }
        else return false;
    }
}
