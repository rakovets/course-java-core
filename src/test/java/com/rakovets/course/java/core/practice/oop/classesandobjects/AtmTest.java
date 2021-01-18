package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class AtmTest {
    public static void main(String[] args) {
        Atm testATM = new Atm(1000, 2000, 4000);
        testATM.addBanknotes100(50);
        testATM.addBanknotes50(60);
        testATM.addBanknotes20(70);
        testATM.isPossibleIssue(1055);
        testATM.getOptionsCombinationBanknotes(1500);
        testATM.getCash(47);
    }
}
