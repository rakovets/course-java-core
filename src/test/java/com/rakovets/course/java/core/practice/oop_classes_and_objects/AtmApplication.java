package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmApplication {
    public static void main(String[] args) {
        Atm atm = new Atm(1, 1, 1);
        System.out.println("Is it a possible amount? " + atm.isPossibleIssue(610));
        atm.addBanknotes20(10);
        atm.addBanknotes50(10);
        atm.addBanknotes100(10);
        System.out.println("Is it a possible amount? " + atm.isPossibleIssue(610));
    }
}
