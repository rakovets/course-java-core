package com.rakovets.java.pattern_mvc.pizzeria.database;

import java.util.List;

public class PizzaVesuvius extends Pizza {
	public PizzaVesuvius() {
		super(PizzaNames.VESUVIUS.getPizzaName(), 6.3, List.of(IngredientsNames.MOZZARELLA.getIngredient(), IngredientsNames.HAM.getIngredient(),
				IngredientsNames.TOMATOES.getIngredient(), IngredientsNames.DOUGH.getIngredient()));
	}
}
