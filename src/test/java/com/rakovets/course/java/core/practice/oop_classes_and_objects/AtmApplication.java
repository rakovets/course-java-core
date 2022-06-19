package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmApplication {
    public static void main(String[] args) {
        Atm atm = new Atm(0, 0, 0);
        atm.addBanknotes20(15);
        atm.addBanknotes50(8);
        atm.addBanknotes100(87);

        System.out.println("Banknote 20: x" + atm.getNumberBanknotes20());
        System.out.println("Banknote 50: x" + atm.getNumberBanknotes50());
        System.out.println("Banknote 100: x" + atm.getNumberBanknotes100());
    }
}
