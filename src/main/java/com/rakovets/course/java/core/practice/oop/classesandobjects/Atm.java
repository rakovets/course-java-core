package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Atm {
    private int numberBanknotes100;
    private int numberBanknotes50;
    private int numberBanknotes20;
    private int amount;

    Atm() {
    }

    Atm(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        this.numberBanknotes100 = numberBanknotes100;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes20 = numberBanknotes20;
    }

    Atm(int amount) {
        this.amount = amount;
    }

    public void addBanknotes100(int number) {
        numberBanknotes100 += number;
    }

    public void addBanknotes50(int number) {
        numberBanknotes50 += number;
    }

    public void addBanknotes20(int number) {
        numberBanknotes20 += number;
    }

    public void isPossibleIssue(int amount) {
        int count = 0;
        for (int i = 0; i <= numberBanknotes100 && i * 100 <= amount && count < 1; i++) {
            for (int j = 0; j <= numberBanknotes50 && j * 50 <= amount  && count < 1; j++) {
                for (int k = 0; k <= numberBanknotes20 && k * 20 <= amount && count < 1; k++) {
                    if (100 * i + 50 * j + 20 * k == amount) {
                        count++;
                        System.out.println("You can get this amount");
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("No available options. Choose another amount");
        }
    }

    public void getOptionsCombinationBanknotes(int amount) {
        int count = 0;
        this.amount = amount;
        System.out.println("Available options:");
        for (int i = 0; i <= numberBanknotes100 && i * 100 <= amount; i++) {
            for (int j = 0; j <= numberBanknotes50 && j * 50 <= amount; j++) {
                for (int k = 0; k <= numberBanknotes20 && k * 20 <= amount; k++) {
                    if (i * 100 + j * 50 + k * 20 == amount) {
                        count++;
                        System.out.printf("%d) 100$ - %d\n50$ - %d\n20$ - %d\n\n",count, i, j, k);
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("No available options. Choose another amount");
        }
    }

    public void getCash(int option) {
        int count = 0;
        for (int i = 0; i <= numberBanknotes100 && i * 100 <= amount && count <= option; i++) {
            for (int j = 0; j <= numberBanknotes50 && j * 50 <= amount && count <= option; j++) {
                for (int k = 0; k <= numberBanknotes20 && k * 20 <= amount && count <= option; k++) {
                    if (i * 100 + j * 50 + k * 20 == amount) {
                        count++;
                        if (option == count) {
                            numberBanknotes100 -= i;
                            numberBanknotes50 -= j;
                            numberBanknotes20 -= k;
                            System.out.printf("Take you money:\n100$ - %d\n50$ - %d\n20$ - %d\n", i, j, k);
                        }
                    }
                }
            }
        }
        if (option > count) {
            System.out.println("Error option. Try again");
        }
    }
}
