package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(0, 0, 0);
        System.out.println("**Samples of getters, setters and \"addBanknotes\" methods**");
        System.out.printf("Initial amount of Banknotes20: %d\n", atm.getNumberBanknotes20());
        System.out.printf("Initial amount of Banknotes50: %d\n", atm.getNumberBanknotes50());
        System.out.printf("Initial amount of Banknotes100: %d\n", atm.getNumberBanknotes100());
        atm.addBanknotes20(1);
        atm.addBanknotes50(2);
        atm.addBanknotes100(3);
        System.out.println("-----");
        System.out.printf("Updated amount of Banknotes20: %d\n", atm.getNumberBanknotes20());
        System.out.printf("Updated amount of Banknotes50: %d\n", atm.getNumberBanknotes50());
        System.out.printf("Updated amount of Banknotes100: %d\n", atm.getNumberBanknotes100());
    }
}
