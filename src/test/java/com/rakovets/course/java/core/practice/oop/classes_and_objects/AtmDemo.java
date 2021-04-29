package com.rakovets.course.java.core.practice.oop.classes_and_objects;

import java.io.Console;

public class AtmDemo {
    static public void main(String[] args) {
        Atm atm = new Atm(25,10,5);
        System.out.printf("Current state :\n20 - %d\n50 - %d\n100 - %d\n", atm.getNumberBanknotes20(), atm.getNumberBanknotes50(), atm.getNumberBanknotes100());
        atm.addBanknotes20(5);
        atm.addBanknotes50(5);
        atm.addBanknotes100(5);
        System.out.printf("Current state :\n20 - %d\n50 - %d\n100 - %d\n", atm.getNumberBanknotes20(), atm.getNumberBanknotes50(), atm.getNumberBanknotes100());
        System.out.printf("%s", atm.isPossibleIssue(291));
        Atm atm2 = new Atm(25, 25, 20);
        System.out.printf("%s", atm2.getCash(15, 10, 10));
    }
}
