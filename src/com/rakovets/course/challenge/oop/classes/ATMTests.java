package com.rakovets.course.challenge.oop.classes;

public class ATMTests {
	public static void main(String[] args) {
		ATM atm = new ATM(1, 2, 5);
		System.out.println(atm.isPossibleIssue(200));
		System.out.println(atm.isPossibleIssue(500));
		atm.getOptionsCombinationBanknotes(200);
		atm.getCash(0, 0, 10);
		atm.getCash(1, 2, 0);
		atm.addMoney(5, 0 ,0);
		atm.getOptionsCombinationBanknotes(400);
		atm.getCash(4, 0 ,0);
	}
}
