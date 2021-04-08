package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(10,10,10);
//        Atm atm1 = new Atm(2070);
        System.out.printf("\n%d", atm.addBanknotes20(1));
        System.out.printf("\n%d", atm.addBanknotes50(2));
        System.out.printf("\n%d", atm.addBanknotes100(3));
        System.out.printf("%d", atm.isPossibleIssue(270));
        System.out.printf("\n%s", atm.getOptionsCombinationBanknotes(200));
    }
}
