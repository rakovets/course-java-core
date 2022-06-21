package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmApplication {
    public static void main(String[] args) {
        Atm banknotesCounter = new Atm(0, 0, 0);
        System.out.println("Number of 20 Banknotes: " + banknotesCounter.getNumberBanknotes20());
        System.out.println("Number of 50 Banknotes: " + banknotesCounter.getNumberBanknotes50());
        System.out.println("Number of 100 Banknotes: " + banknotesCounter.getNumberBanknotes100());
        banknotesCounter.addBanknotes20(10);
        banknotesCounter.addBanknotes50(5);
        banknotesCounter.addBanknotes100(2);
        System.out.println("New number of 20 Banknotes: " + banknotesCounter.getNumberBanknotes20());
        System.out.println("New number of 50 Banknotes: " + banknotesCounter.getNumberBanknotes50());
        System.out.println("New number of 100 Banknotes: " + banknotesCounter.getNumberBanknotes100());
        System.out.println(banknotesCounter.isPossibleIssue(105));
    }
}
