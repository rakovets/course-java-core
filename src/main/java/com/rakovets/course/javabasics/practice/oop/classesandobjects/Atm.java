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
        int fullCount = (numberBanknotes100 * 100 + numberBanknotes50 * 50 + numberBanknotes20 * 20);
        if ((amount <= fullCount) && (amount % 100 == 0 || amount % 50 == 0 || amount % 20 != 0)) {
            return true;
        } else
            return false;
    }

    public int getOptionsCombinationBanknotes(int amount) {
        int cash100 = amount / 100;
        int cash50 = amount / 50;
        int cash20 = amount / 20;
        int options = 0;
        int fullCount = (numberBanknotes100 * 100 + numberBanknotes50 * 50 + numberBanknotes20 * 20);
        if (amount % 100 == 0) {
            options = 1;
        } else if (amount % 50 == 0 && amount % 100 != 0) {
            options = 2;
        } else {
            options = 3;
        }
        return options;
    }


    public void getCash(int option, int amount) {
        int cash100 = amount / 100;
        int cash50 = amount / 50;
        int cash20 = amount / 20;
        if (option == 1) {
            System.out.println("Take 100 x " + cash100);
        } else if (option == 2) {
            int hunder = amount % 100;
            int fifth = 50 / hunder;
            System.out.println("Take 100x" + amount/100 + " 50x" + fifth);
        }
        if (option == 3) {
            int hunder = amount % 100;
            int fifth = amount%50;
            System.out.println("Take 100 x " + amount/100 + " 50x" + hunder/50 + " 20x" + fifth/20);
        }


        //    return true;


    }

}


