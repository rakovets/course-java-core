package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmApplication {
    public static void main(String[] args) {
        Atm atm = new Atm(10,20,30);
        atm.addBanknotes20(1);
        atm.addBanknotes50(1);
        atm.addBanknotes100(1);
    }
}

