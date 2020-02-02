package com.rakovets.java.junit.pizzeria.models;

public class CostPizza {
	public double calculationCost(double price, int numberPizza, double discount) {
		return price * numberPizza - discount;
	}
}