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
        if ((amount <= fullCount) && (amount % 100 == 0 || amount % 50 == 0 || amount / 20 > 0)) {
            return true;
        } else
            return false;
    }

    public void getOptionsCombinationBanknotes(int amount) {

        // int fullCount = (numberBanknotes100 * 100 + numberBanknotes50 * 50 + numberBanknotes20 * 20);
        if (amount % 100 == 0) {
            System.out.println("Available option 1: 100x" + amount / 100);

        } else if (amount % 50 == 0 && amount % 100 != 0) {
            int hunder = amount % 100;
            System.out.println("Available option 2: 100x" + amount / 100 + " 50x" + hunder / 50);

        } else if ( amount > 100 && (amount % 50) % 20 == 0) {
            int hunder = amount % 100;
            int fifth = amount % 50;
            System.out.println("Available option 3: 100x" + amount / 100 + " 50x" + hunder / 50 + " 20x" + fifth / 20);
        }else if ( amount > 100 && (amount % 100) % 20 == 0) {
            int hunder = amount % 100;
            System.out.println("Available option 4: 100x" + amount / 100 +  " 20x" + hunder / 20);
        } else if (amount < 100 && (amount % 50) % 20 == 0) {
            int twenty = amount % 50;
            System.out.println("Available option 5: 50x" + amount / 50 + " 20x" + twenty / 20);
        }
    }

    public void getCash(int option, int amount) {
        int cash100 = amount / 100;
        if (option == 1) {
            System.out.println("Take 100x " + cash100);
        } else if (option == 2) {
            int hunder = amount % 100;

            System.out.println("Take 100x" + amount / 100 + " 50x" + hunder / 50);
        }
        if (option == 3) {
            int hunder = amount % 100;
            int fifth = amount % 50;
            System.out.println("Take your money: 100x" + amount / 100 + " 50x" + hunder / 50 + " 20x" + fifth / 20);
        }if (option == 4) {
            int hunder = amount % 100;
            System.out.println("Take your money: 100x" + amount / 100 +  " 20x" + hunder / 20);
        }if (option == 5) {
            int twenty = amount % 50;
            System.out.println("Take your money: 50x" + amount / 50 + " 20x" + twenty / 20);
        }


        //    return true;


    }

}


