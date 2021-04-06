package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(50,50,50);

        atm.addBanknotes20(10);
        atm.addBanknotes50(20);
        atm.addBanknotes100(20);
        System.out.printf("Number banknotes20 = %d\n", atm.getNumberBanknotes20());
        System.out.printf("Number banknotes50 = %d\n", atm.getNumberBanknotes50());
        System.out.printf("Number banknotes100 = %d\n", atm.getNumberBanknotes100());

        atm.getOptionsCombinationBanknotes(220);
        atm.getCash(2);
        atm.isPossibleIssue(300);
    }
}
