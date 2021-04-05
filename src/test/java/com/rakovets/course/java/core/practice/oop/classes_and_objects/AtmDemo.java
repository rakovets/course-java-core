package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(10, 10, 10);
        int amount = 170;
        int option = 2;

        System.out.println(atm.isPossibleIssue(amount));
        System.out.println(atm.getOptionsCombinationBanknotes(amount));
        System.out.println(atm.getCash(option, amount));
        System.out.println(atm.getNumberBanknotes100() + " " + atm.getNumberBanknotes50()+ " " + atm.getNumberBanknotes20());

    }
}
