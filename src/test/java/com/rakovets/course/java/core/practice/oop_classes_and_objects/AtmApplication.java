package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmApplication {
    public static void main (String[] args){
        Atm newAtm = new Atm(3, 2, 1);
        System.out.println(newAtm);
        System.out.println("Banknotes 20: " + newAtm.addBanknotes20(10) + "\n"
                + "Banknotes 50: " + newAtm.addBanknotes50(10) + "\n"
                + "Banknotes 100: " + newAtm.addBanknotes100(10));
    }
}
