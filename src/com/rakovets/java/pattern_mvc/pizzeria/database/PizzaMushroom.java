package com.rakovets.java.pattern_mvc.pizzeria.database;

import java.util.List;

public class PizzaMushroom extends Pizza {
	public PizzaMushroom() {
		super(PizzaNames.MUSHROOM.getPizzaName(), 5.6, List.of(IngredientsNames.MOZZARELLA.getIngredient(), IngredientsNames.CHAMPIGNON.getIngredient(),
				IngredientsNames.TOMATOES.getIngredient(), IngredientsNames.DOUGH.getIngredient()));
	}
}