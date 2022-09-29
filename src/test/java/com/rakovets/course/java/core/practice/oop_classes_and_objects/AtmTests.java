package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmTests {
    public static void main(String[] args) {


        Atm atm = new Atm(2, 10, 1);
        System.out.println(atm.isPossibleIssue(470));
        System.out.println(atm.getOptionsCombinationBanknotes(470));
    }
}
