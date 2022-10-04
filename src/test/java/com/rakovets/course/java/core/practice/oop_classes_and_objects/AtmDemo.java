package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(30,30,30);
        System.out.printf("In ATM now: %d banknotes 20 nominal, %d banknotes 50 nominal, %d banknotes 100 nominal.\n", atm.getNumberBanknotes20(), atm.getNumberBanknotes50(), atm.getNumberBanknotes100());
        atm.addBanknotes20(10);
        atm.addBanknotes50(20);
        atm.addBanknotes100(100);
        System.out.printf("In ATM now: %d banknotes 20 nominal, %d banknotes 50 nominal, %d banknotes 100 nominal.\n", atm.getNumberBanknotes20(), atm.getNumberBanknotes50(), atm.getNumberBanknotes100());
    }
}
