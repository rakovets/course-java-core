package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Atm {
    private int numberBanknotes100;
    private int numberBanknotes50;
    private int numberBanknotes20;

    public Atm(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        this.numberBanknotes100 = numberBanknotes100;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes20 = numberBanknotes20;
    }

    public void addBanknotes100(int number) {
        this.numberBanknotes100 += number;
    }

    public void addBanknotes50(int number) {
        this.numberBanknotes50 += number;
    }

    public void addBanknotes20(int number) {
        this.numberBanknotes20 += number;
    }

    public boolean isPossibleIssue(int amount) {
        boolean possible = true;
        int totalMoney = this.numberBanknotes100 * 100 + this.numberBanknotes50 * 50 + this.numberBanknotes20 * 20;
        if (amount > totalMoney) {
            possible = false;
        }
        return possible;
    }

    public void getOptionsCombinationBanknotes(int amount) {
//        int byn100 = this.numberBanknotes100 * 100;
//        int byn50 = this.numberBanknotes50 * 50;
//        int byn20 = this.numberBanknotes20 * 20;

        int count = 0;
        for (int i = 0; i <= this.numberBanknotes100 && amount >= i * 100; i++) {
            for (int j = 0; j <= this.numberBanknotes50 && amount >= j * 50; j++) {
                for (int k = 0; k <= this.numberBanknotes20 && amount >= k * 20; k++) {
                    if (i * 100 + j * 50 + k * 20 == amount) {
                        count++;
                        System.out.printf("%d) 100$ - %d\n50$ - %d\n20$ - %d\n\n", count, i, j, k);
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("No available options. Choose another amount");
        }
    }



}
