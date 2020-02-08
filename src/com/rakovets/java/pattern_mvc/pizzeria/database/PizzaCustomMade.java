package com.rakovets.java.pattern_mvc.pizzeria.database;

import java.util.List;

public class PizzaCustomMade extends Pizza {
	public PizzaCustomMade(List<String> ingredients) {
		super(PizzaNames.CUSTOM_MADE.getPizzaName(), 15.9, ingredients);
	}
}