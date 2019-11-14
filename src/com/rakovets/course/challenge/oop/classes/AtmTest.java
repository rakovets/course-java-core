package com.rakovets.course.challenge.oop.classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AtmTest {
	public static void main(String[] args) {
		Atm atm = new Atm(1000, 1000, 1000);
		SimpleDateFormat calendar = new SimpleDateFormat("dd MMM k:mm:ss");
		System.out.printf("<<<ATM>>> %s load banknotes: ", calendar.format(new Date()));
		System.out.printf("\n\tBanknotes 100$ - %d pc\n\tBanknotes 50$ - %d pc\n\tBanknotes 20$ - %d pc\n\n", atm.getCountBanknote100(), atm.getCountBanknote50(), atm.getCountBanknote20());
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of money to upload: ");
		int unloadSumBanknote = scanner.nextInt();
		System.out.printf("Operation result: %s\n", atm.checkCurrentSumRequest(unloadSumBanknote));
		System.out.printf("\n<<<ATM>>> %s balance banknotes: ", calendar.format(new Date()));
		System.out.printf("\n\tBanknotes 100$ - %d pc\n\tBanknotes 50$ - %d pc\n\tBanknotes 20$ - %d pc\n", atm.getCountBanknote100(), atm.getCountBanknote50(), atm.getCountBanknote20());
	}
}
