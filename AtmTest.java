package com.rakovets.course.challenge.oopClassesAndObjects;

public class AtmTest {
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.display();
        atm.setCountBanknoteNominal20(400);
        atm.setCountBanknoteNominal50(500);
        atm.setCountBanknoteNominal100(200);
        atm.display();
        atm.checkCurrentRequestSum(4536284);

    }
}
