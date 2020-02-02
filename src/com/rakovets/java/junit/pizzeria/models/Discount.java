package com.rakovets.java.junit.pizzeria.models;

public class Discount {
	private double discount;

	public double discountNumberPizza(String day, int numberPizza, double price) {
		if (numberPizza >= 3) {
			discount = numberPizza * price * 0.1;
		} else discount = discountDayPizza(day, numberPizza, price);
		return discount;
	}

	public double discountDayPizza(String day, int numberPizza, double price) {
		if (day.equals("суббота") || day.equals("воскресенье")) {
			discount = 0;
		} else {
			discount = numberPizza * price * 0.1;
		}
		return discount;
	}
}