package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public int addBanknotes20(int number) {
        return numberBanknotes20 += number;
    }

    public int addBanknotes50(int number) {
        return numberBanknotes50 += number;
    }

    public int addBanknotes100(int number) {
        return numberBanknotes100 += number;
    }

    public int getNumberBanknotes20() {
        return numberBanknotes20;
    }

    public int getNumberBanknotes50() {
        return numberBanknotes50;
    }

    public int getNumberBanknotes100() {
        return numberBanknotes100;
    }

    int numberOptions = 0;
    int denominationFirstBanknotes = 20;
    int denominationSecondBanknotes = 50;
    int denominationThirdBanknotes = 100;
    int[][] result = new int[1000][3];

    public void getOptionsCombinationBanknotes (int amount) {
        int necessaryNumberBanknotes100 = amount / denominationThirdBanknotes;
        if (necessaryNumberBanknotes100 > numberBanknotes100) {
            necessaryNumberBanknotes100 = numberBanknotes100;
        }
        do {
            int balanceAfterBanknotes100 = amount - necessaryNumberBanknotes100 * denominationThirdBanknotes;
            int necessaryNumberBanknotes50 = balanceAfterBanknotes100 / denominationSecondBanknotes;
            if (necessaryNumberBanknotes50 > numberBanknotes50) {
                necessaryNumberBanknotes50 = numberBanknotes50;
            }
            do {
                int balanceAfterBanknotes50 = balanceAfterBanknotes100 - necessaryNumberBanknotes50 * denominationSecondBanknotes;
                int necessaryNumberBanknotes20 = balanceAfterBanknotes50 / denominationFirstBanknotes;
                if (necessaryNumberBanknotes20 > numberBanknotes20) {
                    break;
                }
                if (balanceAfterBanknotes50 % denominationFirstBanknotes == 0) {
                    result[numberOptions][0] = necessaryNumberBanknotes100;
                    result[numberOptions][1] = necessaryNumberBanknotes50;
                    result[numberOptions][2] = necessaryNumberBanknotes20;
                    numberOptions++;
                }
                necessaryNumberBanknotes50--;
            } while (necessaryNumberBanknotes50 >= 0);
            necessaryNumberBanknotes100--;
        } while (necessaryNumberBanknotes100 >= 0);

        System.out.println("");
        if (numberOptions == 0) {
            System.out.println("Sorry, but this ATM cannot dispense the required amount:(");
        } else {
            System.out.printf("Number of possible options: %d\n", numberOptions);
            for (int i = 0; i <= (numberOptions - 1); i++) {
                System.out.printf("Option " + (i + 1) + ": 100 x %d; 50 x %d; 20 x %d\n", result[i][0], result[i][1], result[i][2]);
            }
        }
    }

    public void getCash(int option) {
        System.out.println("");
        if (option > numberOptions) {
            System.out.println("Invalid option specified");
        }
        numberBanknotes20 -= result[option -1 ][2];
        numberBanknotes50 -= result[option - 1][1];
        numberBanknotes100 -= result[option - 1][0];

        System.out.printf("Number banknotes20 = %d\n", numberBanknotes20);
        System.out.printf("Number banknotes50 = %d\n", numberBanknotes50);
        System.out.printf("Number banknotes100 = %d\n", numberBanknotes100);
    }

    public boolean isPossibleIssue (int amount) {
        boolean possibleToCalculate = false;

        int necessaryNumberBanknotes100 = amount / denominationThirdBanknotes;
        if (necessaryNumberBanknotes100 > numberBanknotes100) {
            necessaryNumberBanknotes100 = numberBanknotes100;
        }
        do {
            int balanceAfterBanknotes100 = amount - necessaryNumberBanknotes100 * denominationThirdBanknotes;
            int necessaryNumberBanknotes50 = balanceAfterBanknotes100 / denominationSecondBanknotes;
            if (necessaryNumberBanknotes50 > numberBanknotes50) {
                necessaryNumberBanknotes50 = numberBanknotes50;
            }
            do {
                int balanceAfterBanknotes50 = balanceAfterBanknotes100 - necessaryNumberBanknotes50 * denominationSecondBanknotes;
                int necessaryNumberBanknotes20 = balanceAfterBanknotes50 / denominationFirstBanknotes;
                if (necessaryNumberBanknotes20 > numberBanknotes20) {
                    break;
                }
                if (balanceAfterBanknotes50 % denominationFirstBanknotes == 0) {
                   possibleToCalculate = true;
                   break;
                }
                necessaryNumberBanknotes50--;
            } while (necessaryNumberBanknotes50 >= 0);
            necessaryNumberBanknotes100--;
        } while (necessaryNumberBanknotes100 >= 0);

        System.out.println("");
        if (possibleToCalculate == false) {
            System.out.println("It is not possible to make a calculation");
        } else {
            System.out.println("It is possible to make a calculation");
        }

        return possibleToCalculate;
    }
}
