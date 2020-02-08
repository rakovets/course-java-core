package com.rakovets.java.pattern_mvc.pizzeria.models;

public class Profit {
	private double numberSalesProfit;

	public Profit(double numberSalesProfit) {
		this.numberSalesProfit = numberSalesProfit;
	}

	public void setProfit(double cost) {
		this.numberSalesProfit = this.numberSalesProfit + cost;
	}

	public double getNumberProfit() {
		return numberSalesProfit;
	}
}