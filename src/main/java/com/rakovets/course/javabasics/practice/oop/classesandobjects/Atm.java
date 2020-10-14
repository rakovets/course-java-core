package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Atm {
    private int numberBanknotes100;
    private int numberBanknotes50;
    private int numberBanknotes20;


    Atm(int numOf100, int numof50, int numOf20) {
        this.numberBanknotes100 = numOf100;
        this.numberBanknotes50 = numof50;
        this.numberBanknotes20 = numOf20;
    }

    public void addBanknotes100(int number) {
        this.numberBanknotes100 = number;

    }

    public void addBanknotes50(int number) {
        this.numberBanknotes50 = number;

    }

    public void addBanknotes20(int number) {
        this.numberBanknotes20 = number;

    }

    public boolean isPossibleIssue(int amount) {
        //if (amount <= (this.numberBanknotes100 + this.numberBanknotes50 + this.numberBanknotes20 ))
        return true;
    }

    public int getOptionsCombinationBanknotes(int amount) {
        int one = 1;
        return one;
    }


    public boolean getCash(int option) {
        if (option == 1);
            return true;



    }

}


