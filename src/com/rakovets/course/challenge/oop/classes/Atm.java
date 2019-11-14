package com.rakovets.course.challenge.oop.classes;

public class Atm {
	private int countBanknote20;
	private int countBanknote50;
	private int countBanknote100;

	Atm(int countBanknote20, int countBanknote50, int countBanknote100) {
		this.countBanknote20 = countBanknote20;
		this.countBanknote50 = countBanknote50;
		this.countBanknote100 = countBanknote100;
	}

	boolean checkCurrentSumRequest(int unloadSumBanknote) {
		boolean result = false;
		if (unloadSumBanknote % 10 == 0) {
			for (int i = 0; i <= countBanknote20 && result == false; i++) {
				for (int j = 0; j <= countBanknote50 && result == false; j++) {
					for (int k = 0; k <= countBanknote100; k++) {
						if (unloadSumBanknote == i * 20 + j * 50 + k * 100) {
							System.out.printf("\nUpload: Banknotes 100$ - %dpc,  Banknotes 50$ - %dpc,  Banknotes 20$ - %dpc\n", k, j, i);
							result = true;
							setCountBanknote20(countBanknote20 - i);
							setCountBanknote50(countBanknote50 - j);
							setCountBanknote100(countBanknote100 - k);
						}
					}
				}
			}
		} else {
			System.out.println("\nNot valid sum!");
		}
		return result;
	}

	public int getCountBanknote20() {
		return countBanknote20;
	}

	public void setCountBanknote20(int countBanknote20) {
		this.countBanknote20 = countBanknote20;
	}

	public int getCountBanknote50() {
		return countBanknote50;
	}

	public void setCountBanknote50(int countBanknote50) {
		this.countBanknote50 = countBanknote50;
	}

	public int getCountBanknote100() {
		return countBanknote100;
	}

	public void setCountBanknote100(int countBanknote100) {
		this.countBanknote100 = countBanknote100;
	}
}
