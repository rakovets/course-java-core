package com.rakovets.course.java.core.practice.oop.classes_and_objects;

import java.util.ArrayList;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public void addBanknotes20(int number) {
        numberBanknotes20 += number;
    }

    public void addBanknotes50(int number) {
        numberBanknotes50 += number;
    }

    public void addBanknotes100(int number) {
        numberBanknotes100 += number;
    }

    public boolean isPossibleIssue(int amount) {
        final int DENOMINATION20 = 20;
        final int DENOMINATION50 = 50;
        final int DENOMINATION100 = 100;
        int tempNumberBanknotes20 = numberBanknotes20;
        int tempNumberBanknotes50 = numberBanknotes50;
        int tempNumberBanknotes100 = numberBanknotes100;
        boolean answer;
        int sumAllBanknotes = DENOMINATION20 * numberBanknotes20 + DENOMINATION50 * numberBanknotes50
                + DENOMINATION100 * numberBanknotes100;

        if (amount % 10 != 0) {
            answer = false;
        } else {
            if (sumAllBanknotes < amount) {
                answer = false;
            } else {
                while (amount > 0 && tempNumberBanknotes100 > 0) {
                    amount -= DENOMINATION100;
                    tempNumberBanknotes100--;
                }
                if (amount < 0) {
                    amount += DENOMINATION100;
                }
                while (amount > 0 && tempNumberBanknotes50 > 0) {
                    if (amount == 60 || amount == 80) {
                        break;
                    }
                    amount -= DENOMINATION50;
                    tempNumberBanknotes50--;
                }
                if (amount < 0 || amount % DENOMINATION20 != 0) {
                    amount += DENOMINATION50;
                }
                while (amount > 0 && tempNumberBanknotes20 > 0) {
                    amount -= DENOMINATION20;
                    tempNumberBanknotes20--;
                }
                answer = amount == 0;
            }
        }
        return answer;
    }

    public boolean isPossibleIssue(int amount, int banknotes20, int banknotes50, int banknotes100) {
        final int DENOMINATION20 = 20;
        final int DENOMINATION50 = 50;
        final int DENOMINATION100 = 100;
        boolean answer;
        int sumAllBanknotes = DENOMINATION20 * banknotes20 + DENOMINATION50 * banknotes50
                + DENOMINATION100 * banknotes100;

            if (sumAllBanknotes < amount) {
                answer = false;
            } else {
                while (amount > 0 && banknotes100 > 0) {
                    amount -= DENOMINATION100;
                    banknotes100--;
                }
                if (amount < 0) {
                    amount += DENOMINATION100;
                }
                while (amount > 0 && banknotes50 > 0) {
                    if (amount == 60 || amount == 80) {
                        break;
                    }
                    amount -= DENOMINATION50;
                     banknotes50--;
                }
                if (amount < 0 || amount % DENOMINATION20 != 0) {
                    amount += DENOMINATION50;
                }
                while (amount > 0 && banknotes20 > 0) {
                    amount -= DENOMINATION20;
                    banknotes20--;
                }
                answer = amount == 0;
            }
        return answer;
    }

    public ArrayList<Integer[]> getOptionsCombinationBanknotes(int amount) {
        ArrayList<Integer[]> list = new ArrayList<>();
        if (isPossibleIssue(amount)) {
            for (int i = 0; i <= numberBanknotes20; i++) {
                if (numberBanknotes20 * i > amount) {
                    break;
                }
                for (int j = 0; j <= numberBanknotes50; j++) {
                    if (numberBanknotes50 * j > amount) {
                        break;
                    }
                    for (int k = 0; k <= numberBanknotes100; k++) {
                        if (numberBanknotes100 * k > amount) {
                            break;
                        } else if (isPossibleIssue(amount, i, j, k) && i * 20 + j * 50 + k * 100 == amount) {
                            Integer[] combination = {i, j, k};
                            list.add(combination);
                        }
                    }
                }
            }
        } else {
            list = null;
        }
        return list;
    }

    public int getCash(Integer[] variant) {
        final int DENOMINATION20 = 20;
        final int DENOMINATION50 = 50;
        final int DENOMINATION100 = 100;
        int sumBanknotes;
        numberBanknotes20 -= variant[0];
        numberBanknotes50 -= variant[1];
        numberBanknotes100 -= variant[2];
        sumBanknotes = DENOMINATION20 * variant[0] + DENOMINATION50 * variant[1] + DENOMINATION100 * variant[2];
        return sumBanknotes;
    }
}
