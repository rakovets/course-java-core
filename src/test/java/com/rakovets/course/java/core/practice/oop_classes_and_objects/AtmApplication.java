package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmApplication {
    public static void main(String[] args) {
        Atm banknotesCounter = new Atm(0,0,0);
        System.out.println("Number of 20 Banknotes: " + banknotesCounter.getNumberBanknotes20());
        System.out.println("Number of 50 Banknotes: " + banknotesCounter.getNumberBanknotes50());
        System.out.println("Number of 100 Banknotes: " + banknotesCounter.getNumberBanknotes100());
        banknotesCounter.addBanknotes20(1);
        banknotesCounter.addBanknotes50(1);
        banknotesCounter.addBanknotes100(1);
        System.out.println("New number of 20 Banknotes: " + banknotesCounter.getNumberBanknotes20());
        System.out.println("New number of 50 Banknotes: " + banknotesCounter.getNumberBanknotes50());
        System.out.println("New number of 100 Banknotes: " + banknotesCounter.getNumberBanknotes100());
        banknotesCounter.setAmount(220);
        System.out.println(banknotesCounter.isPossibleIssue(banknotesCounter.getAmount()));
        System.out.println(banknotesCounter.getOptionsCombinationBanknotes(banknotesCounter.getAmount()));
    }
}
