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
        boolean isPossibleIssue = false;
        for (int i = 0; i <= this.numberBanknotes20; i++) {
            for (int j = 0; j <= this.numberBanknotes50; j++) {
                for (int k = 0; k <= this.numberBanknotes100; k++) {
                    if (i * 20 + j * 50 + k * 100 == amount) {
                        isPossibleIssue = true;
                        break;
                    }
                }
            }
            if (isPossibleIssue)
                break;
        }
        return isPossibleIssue;
    }

    public void getOptionsCombinationBanknotes(int amount) {
        if (this.isPossibleIssue(amount)) {
            System.out.println("Choose cash withdrawal option:");
            int option = 0;
            for (int i = 0; i <= numberBanknotes20; i++) {
                for (int j = 0; j <= numberBanknotes50; j++) {
                    for (int k = 0; k <= numberBanknotes100; k++) {
                        var b = i * 20 + j * 50 + k * 100 == amount;
                        if (b) {
                            String optionsCombinationBanknotes = "";
                            optionsCombinationBanknotes = "Option " + ++option + ": ";
                            if (i != 0) {
                                optionsCombinationBanknotes += "20 x " + i + "   ";
                            }
                            if (j != 0) {
                                optionsCombinationBanknotes += "50 x " + j + "   ";
                            }
                            if (k != 0) {
                                optionsCombinationBanknotes += "100 x " + k;
                                System.out.println(optionsCombinationBanknotes);
                            } else {
                                System.out.println("The amount you selected is not available. Enter another amount");
                            }
                        }
                    }
                }
            }
        }
    }

    public void getCash(int selectedOption) {
        int amount = 0;
        if (this.isPossibleIssue(amount)) {
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
