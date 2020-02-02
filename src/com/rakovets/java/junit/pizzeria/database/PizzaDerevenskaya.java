package com.rakovets.java.junit.pizzeria.database;

import com.rakovets.java.junit.pizzeria.demo.IngredientsNames;
import com.rakovets.java.junit.pizzeria.demo.PizzaNames;

import java.util.List;

public class PizzaDerevenskaya extends Pizza {
	public PizzaDerevenskaya() {
		super(PizzaNames.DEREVENSKAYA.getPizzaName(), 5.5, List.of(IngredientsNames.MOZZARELLA.getIngredient(), IngredientsNames.EGG.getIngredient(),
				IngredientsNames.BACON.getIngredient(), IngredientsNames.CUCUMBER.getIngredient(),
				IngredientsNames.DOUGH.getIngredient()));
	}
}