package com.rakovets.java.pattern_mvc.pizzeria.database;

import java.util.List;

public class PizzaDerevenskaya extends Pizza {
	public PizzaDerevenskaya() {
		super(PizzaNames.DEREVENSKAYA.getPizzaName(), 5.5, List.of(IngredientsNames.MOZZARELLA.getIngredient(), IngredientsNames.EGG.getIngredient(),
				IngredientsNames.BACON.getIngredient(), IngredientsNames.CUCUMBER.getIngredient(),
				IngredientsNames.DOUGH.getIngredient()));
	}
}