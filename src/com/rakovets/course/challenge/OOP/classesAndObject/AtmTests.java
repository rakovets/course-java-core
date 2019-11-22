package com.rakovets.course.challenge.OOP.classesAndObject;

public class AtmTests {
    public static void main(String[] args) {

        Atm atm = new Atm();

        atm.addBanknotes100(10);
        atm.addBanknotes50(20);
        atm.addBanknotes20(30);

        System.out.println("Banknotes100: " + atm.numberBanknotes100);
        System.out.println("Banknotes50: " + atm.numberBanknotes50);
        System.out.println("Banknotes20: " + atm.numberBanknotes20);
    }
}
