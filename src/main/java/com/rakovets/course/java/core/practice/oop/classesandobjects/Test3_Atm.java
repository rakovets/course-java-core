package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Test3_Atm {

    public static void main(String[] args) {

        int numberBanknotes20 = 20;
        int numberBanknotes50 = 20;
        int numberBanknotes100 = 20;
        int amount = 1100;
        boolean isPossibleIssue = false;
        int selectedOption = 3;

        for (int i = 0; i <= numberBanknotes20; i++) {
            for (int j = 0; j <= numberBanknotes50; j++) {
                for (int k = 0; k <= numberBanknotes100; k++) {
                    if (i * 20 + j * 50 + k * 100 == amount) {
                        isPossibleIssue = true;
                        break;
                    }
                }
            }
            if (isPossibleIssue)
                break;
        }

        if (isPossibleIssue) {
            int option = 0;
            for (int i = 0; i <= numberBanknotes20; i++) {
                for (int j = 0; j <= numberBanknotes50; j++) {
                    for (int k = 0; k <= numberBanknotes100; k++) {
                        var b = i * 20 + j * 50 + k * 100 == amount;
                        if (b)
                            if (++option == selectedOption)
                                System.out.println("Take the cash");
                    }
                }
            }
        } else
            System.out.println("The amount you selected is not available. Enter another amount");
    }
}
