package com.rakovets.java.junit.pizzeria.database;

import com.rakovets.java.junit.pizzeria.demo.PizzaNames;

import java.util.List;

public class PizzaCustomMade extends Pizza {
	public PizzaCustomMade(List<String> ingredients) {
		super(PizzaNames.CUSTOM_MADE.getPizzaName(), 15.9, ingredients);
	}
}