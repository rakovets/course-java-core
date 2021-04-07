package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(50, 50 ,50);
        System.out.printf("note 20 = %d\nnote 50 = %d\nnote 100 = %d\n", atm.getNumberBanknotes20(), atm.getNumberBanknotes50(), atm.getNumberBanknotes100());
        atm.addBanknotes20(50);
        atm.addBanknotes50(100);
        atm.addBanknotes100(1);
        System.out.printf("note 20 = %d\nnote 50 = %d\nnote 100 = %d\n", atm.getNumberBanknotes20(), atm.getNumberBanknotes50(), atm.getNumberBanknotes100());
    }
}
