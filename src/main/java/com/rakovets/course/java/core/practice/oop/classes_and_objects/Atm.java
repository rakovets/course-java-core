package com.rakovets.course.java.core.practice.oop.classes_and_objects;

import java.util.ArrayList;
import java.util.List;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    public Atm (int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
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
    public boolean isPossibleIssue(int amount) {
        int amountBanknotes20 = numberBanknotes20;
        int amountBanknotes50 = numberBanknotes50;
        int amountBanknotes100 = numberBanknotes100;
        int banknotes20 = 20;
        int banknotes50 = 50;
        int banknotes100 = 100;
        int amountAllBanknotes = banknotes20 * amountBanknotes20 + banknotes50 * amountBanknotes50
                + banknotes100 * amountBanknotes100;
        boolean check;

        System.out.println("Amount all banknotes: " + amountAllBanknotes + " BYN");
        if (amountAllBanknotes < amount || amount % 10 != 0 || amount == 0) {
            check = false;
        } else {
            while (amount > 0 && amountBanknotes100 > 0) {
                amount -= banknotes100;
                amountBanknotes100--;
            }
            if (amount < 0) {
                amount += banknotes100;
                amountBanknotes100++;
            }
            while (amount > 0 && amountBanknotes50 > 0) {
                amount -= banknotes50;
                amountBanknotes50--;
            }
            if (amount < 0) {
                amount += banknotes50;
                amountBanknotes50++;
            }
            while (amount > 0 && amountBanknotes20 > 0) {
                amount -= banknotes20;
                amountBanknotes20--;
            }
            check = true;
        }
        return check;
    }
    public void getOptionsCombinationBanknotes (int amount, int maxValue, int count20, int count50, int count100, List<String> result) {
        /*Да, я понимаю что String Builder нельзя было испоользовать, но, к сожалению, мне не хватило времени на другую
        реализацию, так что пришлось быстренько написать этот костыль.*/
        if (amount < 0) {
            return;
        }
        if (amount == 0) {
            StringBuilder sb = new StringBuilder();
            if (count100 > 0) {
                sb.append("100(x" + count100 + ") ");
            }
            if (count50 > 0) {
                sb.append("50(x" + count50 + ") ");
            }
            if (count20 > 0) {
                sb.append("20(x"+ count20 + ") ");
            }
            result.add(sb.toString());
            return;
        }
                if ((maxValue >= 100) && (amount >= 100)) {
                    getOptionsCombinationBanknotes(amount - 100, 100, count20, count50,
                            count100 + 1, result);
                }
                if ((maxValue >= 50) && (amount >= 50)) {
                    getOptionsCombinationBanknotes(amount - 50, 50, count20, count50 + 1,
                            count100, result);
                }
                if (amount >= 20) {
                    getOptionsCombinationBanknotes(amount - 20, 20, count20 + 1, count50,
                            count100, result);
                }
    }
}
