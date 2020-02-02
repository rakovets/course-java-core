package com.rakovets.java.junit.pizzeria.database;

import java.util.List;

public class Pizza {
	private String name;
	private double price;
	private List<String> ingredients;

	public Pizza(String name, double price, List<String> ingredients) {
		this.name = name;
		this.price = price;
		this.ingredients = ingredients;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public List<String> getIngredients() {
		return ingredients;
	}
}