package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(10, 20 ,30);
        System.out.printf("denomination 20: %d bills\ndenomination 50: %d bills\ndenomination 100: %d bills\n\n", atm.getNumberBanknotes20(), atm.getNumberBanknotes50(), atm.getNumberBanknotes100());

        atm.addBanknotes20(30);
        atm.addBanknotes50(55);
        atm.addBanknotes100(100);
        System.out.printf("denomination 20: %d bills\ndenomination 50: %d bills\ndenomination 100: %d bills\n", atm.getNumberBanknotes20(), atm.getNumberBanknotes50(), atm.getNumberBanknotes100());
    }
}
