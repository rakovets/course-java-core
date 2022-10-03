package com.rakovets.course.java.core.practice.oop_principles;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm1 = new Atm (5,2,1);
        System.out.println("Banknotes 20 - " + atm1.addNumberBanknotes20());
        System.out.println("Banknotes 50 - " + atm1.addNumberBanknotes50());
        System.out.println("Banknotes 100 - " + atm1.addNumberBanknotes100());
    }
}
