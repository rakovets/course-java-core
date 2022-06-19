package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmApplication {
    public static void main(String[] args) {
        Atm atm = new Atm(60, 11, 2);
        System.out.println(atm.getNumberBanknotes20());
        System.out.println(atm.getNumberBanknotes50());
        System.out.println(atm.getNumberBanknotes100());
    }
}
