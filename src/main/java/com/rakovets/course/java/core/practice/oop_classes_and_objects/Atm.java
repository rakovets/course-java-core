package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public boolean isPossibleIssue(int amount) {
        int newDigit = amount;
        int abc = newDigit / 20;
        for (int i = abc; i != -1; i--) {
            newDigit -= 20 * i;
            if (newDigit % 50 == 0 && numberBanknotes50 >= newDigit / 50 && numberBanknotes20 >= i) {
                return true;
            }
            if (newDigit % 100 == 0 && newDigit != 0 && numberBanknotes20 >= i && numberBanknotes100 >= newDigit / 100) {
                return true;
            }
            newDigit = amount;
        }
        return false;
    }

    public void getOptionsCombinationBanknotes(int amount) {
        int newDigit = amount;
        int digit20 = 0;
        int digit50 = 0;
        int digit100 = 0;
        int count = 0;
        int abc = newDigit / 20;
        for (int i = abc; i != -1; i--) {
            newDigit -= 20 * i;
            if (newDigit % 50 == 0 && numberBanknotes50 >= newDigit / 50 && numberBanknotes20 >= i) {
                digit20 = i;
                digit50 = newDigit / 50;
                arrDigit20[count] = digit20;
                arrDigit50[count] = digit50;
                arrDigit100[count] = digit100;
                System.out.println(digit20 + " 20$ " + digit50 + " 50$ " + digit100 + " 100$ ");
                count++;
                digit50 = 0;
            }
            if (newDigit % 100 == 0 && newDigit != 0 && numberBanknotes20 >= i && numberBanknotes100 >= newDigit / 100) {
                digit20 = i;
                digit100 = newDigit / 100;
                arrDigit20[count] = digit20;
                arrDigit50[count] = digit50;
                arrDigit100[count] = digit100;
                System.out.println(digit20 + " 20$ " + digit50 + " 50$ " + digit100 + " 100$ ");
                count++;
                digit100 = 0;
            }
            newDigit = amount;
        }
    }

    public void getCash(int option) {
        for (int i = 0; i < 100; i++) {
            if (i == option - 1) {
                numberBanknotes20 -= arrDigit20[i];
                numberBanknotes50 -= arrDigit50[i];
                numberBanknotes100 -= arrDigit100[i];
            }
        }
        System.out.println("Here....You can take your money!");
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

    private int numberBanknotes20 = 0;
    private int numberBanknotes50 = 0;
    private int numberBanknotes100 = 0;
    private int[] arrDigit20 = new int[100];
    private int[] arrDigit50 = new int[100];
    private int[] arrDigit100 = new int[100];
}
