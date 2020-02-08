package com.rakovets.java.pattern_mvc.pizzeria.database;

import java.util.List;

public class PizzaPepperoni extends Pizza {
	public PizzaPepperoni() {
		super(PizzaNames.PEPPERONI.getPizzaName(), 10.9, List.of(IngredientsNames.MOZZARELLA.getIngredient(),
				IngredientsNames.PEPPERONI.getIngredient(), IngredientsNames.TOMATOES.getIngredient(),
				IngredientsNames.DOUGH.getIngredient()));
	}
}
