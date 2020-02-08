package com.rakovets.java.pattern_mvc.pizzeria.models;

public class CostPizza {
	public double calculationCost(double price, int numberPizza, double discount) {
		return price * numberPizza - discount;
	}
}