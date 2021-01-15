package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Test1_Atm {

    public static void main(String[] args) {

        int numberBanknotes20 = 1;
        int numberBanknotes50 = 150;
        int numberBanknotes100 = 200;
        int amount = 1000;
        boolean isPossibleIssue = false;

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
        System.out.println(isPossibleIssue);
    }
}


