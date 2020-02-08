package com.rakovets.java.pattern_mvc.pizzeria.database;

import java.util.List;

public class PizzaBarbecue extends Pizza {
	public PizzaBarbecue() {
		super(PizzaNames.BARBECUE.getPizzaName(), 11.9, List.of(IngredientsNames.MOZZARELLA.getIngredient(),
				IngredientsNames.CHICKEN.getIngredient(), IngredientsNames.BACON.getIngredient(),
				IngredientsNames.TOMATOES.getIngredient(), IngredientsNames.DOUGH.getIngredient()));
	}
}
