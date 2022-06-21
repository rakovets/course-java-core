package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmTest {
    public static void main(String[] args) {
        int numberBanknotes20 = 1;
        int numberBanknotes50 = 1;
        int numberBanknotes100 = 1;

        Atm atm = new Atm(numberBanknotes20, numberBanknotes50, numberBanknotes100);

        numberBanknotes20 = 2;
        atm.addBanknotes20(numberBanknotes20);
        numberBanknotes50 = 2;
        atm.addBanknotes50(numberBanknotes50);
        numberBanknotes100 = 2;
        atm.addBanknotes100(numberBanknotes100);

        int amount = 250;

        boolean havingMoney = atm.isPossibleIssue(amount);

        System.out.println("\n" + atm.displaysATextAboutThePossibilityOfWithdrawingMoneyFromAnATM(havingMoney));

        System.out.print("\n" + atm.getOptionsCombinationBanknotes(amount));
    }
}
