package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmApplictaion {
    public static void main(String[] args) {
        Atm bank = new Atm(1, 2, 2);
        bank.addBanknotes20(1);
        bank.addBanknotes50(1);
        bank.addBanknotes100(1);
        System.out.println("Number banknotes 20-" + bank.getNumberBanknotes20()+", Number banknotes 50-"
                + bank.getNumberBanknotes50()+", Number banknotes 100-" +bank.getNumberBanknotes100());
        System.out.println(bank.isPossibleIssue(210));
    }
}
