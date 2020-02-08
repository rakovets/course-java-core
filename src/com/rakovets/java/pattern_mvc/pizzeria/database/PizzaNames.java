package com.rakovets.java.pattern_mvc.pizzeria.database;

public enum PizzaNames {
	FOUR_СHEESES("Четыре сыра"),
	PEPPERONI("Пепперони"),
	BARBECUE("Барбекю"),
	DEREVENSKAYA("Деревенская"),
	BOLOGNESE("Болоньезе"),
	MUSHROOM("Грибная"),
	VESUVIUS("Везувий"),
	CUSTOM_MADE("Свой рецепт");

	private String pizzaName;


	PizzaNames(String pizza) {
		this.pizzaName = pizza;
	}

	public String getPizzaName() {
		return pizzaName;
	}
}