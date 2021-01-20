package com.rakovets.course.java.core.example.oop.classesandobjects;

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

        for (int i = 0; i <= numberBanknotes100; i++) {
            for (int j = 0; j <= numberBanknotes50; j++) {
                for (int k = 0; k <= numberBanknotes20; k++) {
                    if (100 * i + 50 * j + 20 * k == amount) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String getOptionsCombinationBanknotes(int amount) {
        StringBuilder combinations = new StringBuilder();
        for (int i = 0; i <= numberBanknotes100; i++) {
            for (int j = 0; j <= numberBanknotes50; j++) {
                for (int k = 0; k <= numberBanknotes20; k++) {
                    if (100 * i + 50 * j + 20 * k == amount) {
                        combinations.append(i).append("*100 ").append(j).append("*50 ").append(k).append("*20\n");
                    }
                }
            }
        }
        return combinations.toString();
    }

    public void getCash(String option) {
        String checkOption;
        for (int x = 0; x <= numberBanknotes100; x++) {
            for (int y = 0; y <= numberBanknotes50; y++) {
                for (int z = 0; z <= numberBanknotes20; z++) {
                    checkOption = x + "*100 " + y + "*50 " + z + "*20";
                    if (checkOption.equals(option)) {
                        this.numberBanknotes100 -= x;
                        this.numberBanknotes50 -= y;
                        this.numberBanknotes20 -= z;
                    }
                }
            }
        }
    }
}







