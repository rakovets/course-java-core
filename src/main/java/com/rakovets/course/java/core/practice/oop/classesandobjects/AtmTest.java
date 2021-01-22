package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class AtmTest {
    public static void main(String[] args) {

        Atm testAtm = new Atm(10,20,100);
        testAtm.addBanknotes100(5);
        testAtm.addBanknotes50(5);
        testAtm.addBanknotes20(5);
        testAtm.isPossibleIssue(100);
        testAtm.getOptionsCombinationBanknotes(1000);
        testAtm.getCash(3);
    }
}
