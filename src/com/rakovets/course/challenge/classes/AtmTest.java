package com.rakovets.course.challenge.classes;

public class AtmTest {
    public static void main(String[] args) {
        Atm atm = new Atm(500, 400, 300);
        System.out.println("20: " + atm.getNominalBanknote20() + ", 50: " + atm.getNominalBanknote50() + ", 100: " + atm.getNominalBanknote100());
        atm.setNominalBanknote20(600);
        atm.setNominalBanknote50(500);
        atm.setNominalBanknote100(400);
        System.out.println("20: " + atm.getNominalBanknote20() + ", 50: " + atm.getNominalBanknote50() + ", 100: " + atm.getNominalBanknote100());
    }
}
