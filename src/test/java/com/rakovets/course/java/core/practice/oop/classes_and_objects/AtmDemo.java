package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm (100,150,200);
        System.out.printf("Banknotes 20: %d pc.\nBanknotes 50: %d pc.\nBanknotes 100: %d pc.\n",
                atm.addBanknotes20(10),
                atm.addBanknotes50(20),
                atm.addBanknotes100(30));
        System.out.printf("%b\n", atm.isPossibleIssue(1070));
    }
}
