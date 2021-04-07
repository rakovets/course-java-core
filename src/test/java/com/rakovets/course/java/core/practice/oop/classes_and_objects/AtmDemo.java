package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(10, 20, 30);
        System.out.printf("Number banknotes20 = %d\n", atm.getNumberBanknotes20());
        System.out.printf("Number banknotes50 = %d\n", atm.getNumberBanknotes50());
        System.out.printf("Number banknotes100 = %d\n", atm.getNumberBanknotes100());
        atm.addBanknotes20(5);
        atm.addBanknotes50(7);
        atm.addBanknotes100(9);
        System.out.printf("Sum banknotes20 = %d\n", atm.getNumberBanknotes20());
        System.out.printf("Sum banknotes 50 = %d\n", atm.getNumberBanknotes50());
        System.out.printf("Sum banknotes 100 = %d\n", atm.getNumberBanknotes100());
    }
}
