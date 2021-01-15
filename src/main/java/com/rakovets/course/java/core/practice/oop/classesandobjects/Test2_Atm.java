package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Test2_Atm {

    public static void main(String[] args) {

        int numberBanknotes20 = 2;
        int numberBanknotes50 = 2;
        int numberBanknotes100 = 2;
        int amount = 100;
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


        if (isPossibleIssue) {
            System.out.println("Choose cash withdrawal option:");
            int option = 0;
            for (int i = 0; i <= numberBanknotes20; i++) {
                for (int j = 0; j <= numberBanknotes50; j++) {
                    for (int k = 0; k <= numberBanknotes100; k++) {
                        var b = i * 20 + j * 50 + k * 100 == amount;
                        if (b) {
                            String optionsCombinationBanknotes = "";
                            optionsCombinationBanknotes = "Option " + ++option + ": ";
                            if (i != 0)
                                optionsCombinationBanknotes += "20 x " + i + "   ";
                            if (j != 0)
                                optionsCombinationBanknotes += "50 x " + j + "   ";
                            if (k != 0)
                                optionsCombinationBanknotes += "100 x " + k;
                            System.out.println(optionsCombinationBanknotes);
                        }
                    }
                }
            }
        } else
            System.out.println("The amount you selected is not available. Enter another amount");
    }
}
