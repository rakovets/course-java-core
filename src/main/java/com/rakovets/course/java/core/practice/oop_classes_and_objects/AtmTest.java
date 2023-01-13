package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmTest {
    public static void main(String[] args) {
        Atm atmAlfaBank = new Atm(0, 0, 0);

        System.out.printf("ATM number of 20BYN nominal banknotes = %s%n" +
                        "ATM number of 50BYN nominal banknotes = %s%n" +
                        "ATM number of 100BYN nominal banknotes = %s%n",
                atmAlfaBank.numberBanknotes20, atmAlfaBank.numberBanknotes50,
                atmAlfaBank.numberBanknotes100);

        atmAlfaBank.addBanknotes20(4);
        atmAlfaBank.addBanknotes50(6);
        atmAlfaBank.addBanknotes100(3);

        System.out.println();
        System.out.printf("ATM number of 20BYN nominal banknotes = %s%n" +
                        "ATM number of 50BYN nominal banknotes = %s%n" +
                        "ATM number of 100BYN nominal banknotes = %s%n",
                atmAlfaBank.numberBanknotes20, atmAlfaBank.numberBanknotes50,
                atmAlfaBank.numberBanknotes100);
        //Далее задание со *
        System.out.println();
        System.out.printf("Money is enough: %s%n", atmAlfaBank.isPossibleIssue(300));
        System.out.printf("Money is enough: %s%n", atmAlfaBank.isPossibleIssue(1000));
    }
}
