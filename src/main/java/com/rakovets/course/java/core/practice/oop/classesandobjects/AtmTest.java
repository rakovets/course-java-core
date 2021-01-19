package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class AtmTest {
    public static void main(String[] args) {

        Atm newAtm = new Atm(10, 20, 9, 1000);

        if (newAtm.isPossibleIssue(1000))
            System.out.println("true");
        else
            System.out.println("false");

        if (newAtm.isPossibleIssue(1000))
            newAtm.getOptionsCombinationBanknotes(1000);
        else
            System.out.println("The amount you selected is not available. Enter another amount");

        if (newAtm.isPossibleIssue(1000))
            newAtm.getCash(5);
    }
}
