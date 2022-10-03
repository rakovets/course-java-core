package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmDemo { public static void main(String[] args) {
    Atm atm = new Atm(5, 6, 7);
    System.out.println("Count banknotes 20 = " + atm.getNumberBanknotes20() + ", count banknotes 50 = " + atm.getNumberBanknotes50() + ", count banknotes 100 = " + atm.getNumberBanknotes100());
    atm.addBanknotes20(5);
    atm.addBanknotes50(6);
    atm.addBanknotes100(7);
    System.out.println("Count banknotes 20 = " + atm.getNumberBanknotes20() + ", count banknotes 50 = " + atm.getNumberBanknotes50() + ", count banknotes 100 = " + atm.getNumberBanknotes100());
}
}
