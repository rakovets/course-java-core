package com.rakovets.course.challenge.oop.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class ATM {
	private int numberBanknotes20;
	private int numberBanknotes50;
	private int numberBanknotes100;

	public ATM(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
		this.numberBanknotes20 = numberBanknotes20;
		this.numberBanknotes50 = numberBanknotes50;
		this.numberBanknotes100 = numberBanknotes100;
	}

	public void getCash(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
		if (numberBanknotes20 <= this.numberBanknotes20 && numberBanknotes50 <= this.numberBanknotes50 && numberBanknotes100 <= this.numberBanknotes100) {
			System.out.println("Забирай свои бумажки и проваливай.");
			this.numberBanknotes20 -= numberBanknotes20;
			this.numberBanknotes50 -= numberBanknotes50;
			this.numberBanknotes100 -= numberBanknotes100;
		} else {
			System.out.println("You come and ask me for money, but you ask without respect.");
		}
	}

	public boolean isPossibleIssue(int amount) {
		int allMoney;
		allMoney = this.numberBanknotes100 * 100 + this.numberBanknotes50 * 50 + this.numberBanknotes20 * 20;
		return allMoney >= amount;
	}

	public void addMoney(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
		this.numberBanknotes20 += numberBanknotes20;
		this.numberBanknotes50 += numberBanknotes50;
		this.numberBanknotes100 += numberBanknotes100;
	}

	public void getOptionsCombinationBanknotes(int money) {
		NotesVariants variants = new NotesVariants(money);
		variants.findSolutions(0);

		for (int i = 0; i < variants.solutions.size(); i++) {
			for (int j = i + 1; j < variants.solutions.size(); j++) {
				if (Arrays.equals(variants.solutions.get(i), variants.solutions.get(j))){
					variants.solutions.remove(j);
					j--;
				}
			}
		}

		for (int[] i : variants.solutions) {
			System.out.println(i[0] + " " + i[1] + " " + i[2]);
		}
	}

	static class NotesVariants {
		final int issuedMoney;
		int hundredNotes = 0;
		int fiftyNotes = 0;
		int twentyNotes = 0;
		ArrayList<int[]> solutions = new ArrayList<>();

		NotesVariants(int issuedMoney) {
			this.issuedMoney = issuedMoney;
		}

		void addSolution() {
			solutions.add(new int[]{hundredNotes, fiftyNotes, twentyNotes});
		}

		void prepareToStepBack(int index) {
			switch (index) {
				case 1:
					this.twentyNotes--;
					break;
				case 2:
					this.fiftyNotes--;
					break;
				case 3:
					this.hundredNotes--;
					break;
			}
		}

		int getMoney() {
			return hundredNotes * 100 + fiftyNotes * 50 + twentyNotes * 20;
		}

		void findSolutions(int index) {
			if (this.getMoney() >= this.issuedMoney) {
				if (this.getMoney() > this.issuedMoney) {
					prepareToStepBack(index);
				} else {
					this.addSolution();
					prepareToStepBack(index);
				}
			} else {
				this.twentyNotes++;
				this.findSolutions(1);
				this.fiftyNotes++;
				this.findSolutions(2);
				this.hundredNotes++;
				this.findSolutions(3);
				prepareToStepBack(index);
			}
		}
	}
}