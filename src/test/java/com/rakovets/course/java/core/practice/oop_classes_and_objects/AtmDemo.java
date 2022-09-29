package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(0, 0, 0);

        atm.addBanknotes20(5);
        atm.addBanknotes50(10);
        atm.addBanknotes100(100);

        System.out.println("Banknotes of 20 x " + atm.getNumberBanknotes20());
        System.out.println("Banknotes of 50 x " + atm.getNumberBanknotes50());
        System.out.println("Banknotes of 100 x " + atm.getNumberBanknotes100());
    }


}
