package com.rakovets.course.java.core.practice.oop.classes_and_objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AtmDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount you want to withdraw");
        int choose = scanner.nextInt();
        Atm atm = new Atm(5, 6, 7);
        System.out.println(atm.isPossibleIssue(1000));
        ArrayList<Integer[]> list = atm.getOptionsCombinationBanknotes(choose);
        if (list == null) {
            System.out.println("Error operation");
            return;
        }
        System.out.println("20$ 50$ 100$");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(Arrays.toString(list.get(i)) + " - variant " + (i + 1));
        }
        choose = scanner.nextInt();
        System.out.println("Your cash " + atm.getCash(list.get(choose - 1)) + "$");
        System.out.println(atm.isPossibleIssue(1000));
        atm.addBanknotes20(1);
        atm.addBanknotes50(6);
        atm.addBanknotes100(7);
        System.out.println(atm.isPossibleIssue(1000));
    }
}
