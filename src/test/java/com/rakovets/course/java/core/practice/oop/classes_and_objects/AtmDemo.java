package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(20, 30, 4);

        System.out.printf("Number banknotes 20 = %d\n", atm.getNumberBanknotes20());
        System.out.printf("Number banknotes 50 = %d\n", atm.getNumberBanknotes50());
        System.out.printf("Number banknotes 100 = %d\n", atm.getNumberBanknotes100());

        atm.addBanknotes20(30);
        atm.addBanknotes50(40);
        atm.addBanknotes100(5);
        System.out.printf("Number banknotes 20 = %d\n", atm.getNumberBanknotes20());
        System.out.printf("Number banknotes 50 = %d\n", atm.getNumberBanknotes50());
        System.out.printf("Number banknotes 100 = %d\n", atm.getNumberBanknotes100());
    }
}
