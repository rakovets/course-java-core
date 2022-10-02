package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(1, 2, 3);
        System.out.println("Count banknotes 20 = " + atm.getNumberBanknotes20() + ", count banknotes 50 = " + atm.getNumberBanknotes50() + ", count banknotes 100 = " + atm.getNumberBanknotes100());
        atm.addBanknotes20(3);
        atm.addBanknotes50(2);
        atm.addBanknotes100(1);
        System.out.println("Count banknotes 20 = " + atm.getNumberBanknotes20() + ", count banknotes 50 = " + atm.getNumberBanknotes50() + ", count banknotes 100 = " + atm.getNumberBanknotes100());
    }
}
