package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Atm {
    private int numberBanknotes100;
    private int numberBanknotes50;
    private int numberBanknotes20;

    Atm(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        this.numberBanknotes100 = numberBanknotes100;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes20 = numberBanknotes20;
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

    public boolean isPossibleIssue(int amount) {
        int count = 0;
        for (int i = 0; i <= numberBanknotes100 && i * 100 <= amount && count < 1; i++) {
            for (int j = 0; j <= numberBanknotes50 && j * 50 <= amount  && count < 1; j++) {
                for (int k = 0; k <= numberBanknotes20 && k * 20 <= amount && count < 1; k++) {
                    if (100 * i + 50 * j + 20 * k == amount) {
                        count++;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String getOptionsCombinationBanknotes(int amount) {
        int count = 0;
        String options = "";
        System.out.println("Available options:");
        for (int i = 0; i <= numberBanknotes100 && i * 100 <= amount; i++) {
            for (int j = 0; j <= numberBanknotes50 && j * 50 <= amount; j++) {
                for (int k = 0; k <= numberBanknotes20 && k * 20 <= amount; k++) {
                    if (i * 100 + j * 50 + k * 20 == amount) {
                        count++;
                        options += count + ") 100$ - " + i + "\n50$ - " + j + "\n20$ - " + k + "\n\n";
                    }
                }
            }
        }
        return options;
    }

    public void getCash (String option) {
        for (int a = 0; a <= this.numberBanknotes100; a++) {
            for (int b = 0; b <= this.numberBanknotes50; b++) {
                for (int c = 0; c <= this.numberBanknotes20; c++) {
                    String checkedOption = a + "*100$, " + b + "*50$, " + c + "*20$";
                    if (checkedOption.equals(option)) {
                        this.numberBanknotes100 -= a;
                        this.numberBanknotes50 -= b;
                        this.numberBanknotes20 -= c;
                    }
                }
            }
        }
    }
}
