package com.rakovets.java.solid;

public class NumberPizzasSold {
	private int numberPizzasSold;

	public NumberPizzasSold(int numberPizzasSold) {
		this.numberPizzasSold = numberPizzasSold;
	}

	public int getNumberPizzasSold() {
		return numberPizzasSold;
	}

	public void setNumberPizzasSold(int numberPizzasSold) {
		this.numberPizzasSold = this.numberPizzasSold + numberPizzasSold;
	}
}

