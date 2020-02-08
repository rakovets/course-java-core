package com.rakovets.java.pattern_mvc.pizzeria.database;

import java.util.List;

public class PizzaFourСheeses extends Pizza {
	public PizzaFourСheeses() {
		super(PizzaNames.FOUR_СHEESES.getPizzaName(), 9.9, List.of(IngredientsNames.MOZZARELLA.getIngredient(), IngredientsNames.CHEDDAR.getIngredient(),
				IngredientsNames.PARMESAN.getIngredient(), IngredientsNames.JUGAS.getIngredient(), IngredientsNames.TOMATOES.getIngredient(),
				IngredientsNames.DOUGH.getIngredient()));
	}
}