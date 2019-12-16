package com.rakovets.course.challenge.classes;

public class AtmTest {
    public static void main(String[] args) {


        Atm machine = new Atm(10, 20, 30);
        System.out.println("printing number of 100s: " + machine.numberBanknotes100);
        System.out.println("printing number of 50s: " + machine.numberBanknotes50);
        System.out.println("printing number of 20s: " + machine.numberBanknotes20);
        System.out.println("testing isPossibleIssue metod:");
        machine.isPossibleIssue(100);
        machine.isPossibleIssue(10000);
    }
}
