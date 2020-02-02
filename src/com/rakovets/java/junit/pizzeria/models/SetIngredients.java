package com.rakovets.java.junit.pizzeria.models;

import com.rakovets.java.junit.pizzeria.database.Pizza;

import java.util.Map;

public class SetIngredients {
	public void setIngredient(Pizza pizza, Map<String, Integer> numberIngredients, int numberPizza) {
		for (String ingredient : pizza.getIngredients()) {
			numberIngredients.put(ingredient, numberIngredients.get(ingredient) - numberPizza);
		}
	}
}