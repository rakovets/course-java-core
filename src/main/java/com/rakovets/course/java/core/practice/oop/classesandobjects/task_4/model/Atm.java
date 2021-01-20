package com.rakovets.course.java.core.practice.oop.classesandobjects.task_4.model;

public class Atm {
    private int numberBanknotes100;
    private int numberBanknotes50;
    private int numberBanknotes20;
    private int amount;

    public Atm(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        this.numberBanknotes100 = numberBanknotes100;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes20 = numberBanknotes20;
    }

    public void addBanknotes100(int numberBanknotes100) {
        this.numberBanknotes100 += numberBanknotes100;
    }

    public void addBanknotes50(int numberBanknotes50) {
        this.numberBanknotes50 += numberBanknotes50;
    }

    public void addBanknotes20(int numberBanknotes20) {
        this.numberBanknotes20 += numberBanknotes20;
    }


    public void isPossible(int amount) {
        int totalSum = (this.numberBanknotes20 * 20) + (this.numberBanknotes50 * 50) + (this.numberBanknotes100 * 100);
        if (amount <= totalSum) {
            if (amount % 20 == 0 || amount % 50 == 0 || amount % 100 == 0) {
                System.out.print("\nIs Possible");
            } else {
                System.out.print("\nIs not possible");
            }
        } else {
            System.out.print("\nNo banknotes for this amount");
        }
    }

    public void getOptionsCombinationBanknotes(int amount) {
        this.amount = amount;
        int totalSum = (this.numberBanknotes20 * 20) + (this.numberBanknotes50 * 50) + (this.numberBanknotes100 * 100);
        if (amount <= totalSum) {
            System.out.println("OptionalCombination");
            int row = 1;
            for (int i = 0; i <= this.numberBanknotes20; i++) {
                for (int j = 0; j <= this.numberBanknotes50; j++) {
                    for (int k = 0; k <= this.numberBanknotes100; k++) {
                        if (i * 20 + j * 50 + k * 100 == amount) {
                            System.out.printf("\n%d. %d - 20, %d - 50, %d - 100", row, i, j, k);
                            row++;
                        }

                    }
                }
            }
        } else {
            System.out.println("\nNo banknotes for this amount");
        }
    }
    public void getCash(int option) {
        if (option > 0) {
            int row = 0;
            for (int i = 0; i <= this.numberBanknotes20; i++) {
                for (int j = 0; j <= this.numberBanknotes50; j++) {
                    for (int k = 0; k <= this.numberBanknotes100; k++) {
                        if (i * 20 + j * 50 + k * 100 == amount) {
                            row++;
                            if (option == row) {
                                System.out.printf("\nYour option is \n %d. %d - 20, %d - 50, %d - 100\nTake you money!", row, i, j, k);
                                break;
                            }
                        }

                    }
                }
            }
        } else {
            System.out.println("\nIt is not option's range");
        }
    }
}
