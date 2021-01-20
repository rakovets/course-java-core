package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class AtmTest {
    public static void main(String[] args) {
        Atm atm1 = new Atm(10, 10, 20);
        System.out.println(atm1.isPossibleIssue(2080));
        atm1.getOptionsCombinationBanknotes(390);
    }
}
