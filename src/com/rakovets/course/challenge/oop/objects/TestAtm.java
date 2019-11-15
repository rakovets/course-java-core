package com.rakovets.course.challenge.oop.objects;

public class TestAtm {
    public static void main(String[] args) {
//        Test for constructor
        Atm atm = new Atm();
        atm.display();
//        Test for setters
        atm.addBanknotes20(20);
        atm.addBanknotes50(10);
        atm.addBanknotes100(5);
        atm.display();
//        Test for givOutMone
        atm.giveMoney(1000);
    }
}
