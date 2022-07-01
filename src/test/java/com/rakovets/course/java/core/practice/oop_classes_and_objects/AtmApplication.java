package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmApplication {
    public static void main(String[] args) {
        Atm atm = new Atm(20, 30, 50);

        System.out.println("There are banknotes for 20 in total: " + atm.addBanknotes20(0));
        System.out.println("There are banknotes for 50 in total: " + atm.addBanknotes50(0));
        System.out.println("There are banknotes for 100 in total: " + atm.addBanknotes100(0));
        System.out.println();

        System.out.println("There are banknotes for 20 in total: " + atm.addBanknotes20(5));
        System.out.println("There are banknotes for 50 in total: " + atm.addBanknotes50(3));
        System.out.println("There are banknotes for 100 in total: " + atm.addBanknotes100(9));
        System.out.println();

        System.out.println(atm.isPossibleIssue(505));
        System.out.println(atm.isPossibleIssue(510));
        System.out.println(atm.isPossibleIssue(1200));
        System.out.println(atm.isPossibleIssue(50000000));
        System.out.println(atm.isPossibleIssue(35));
    }
}
