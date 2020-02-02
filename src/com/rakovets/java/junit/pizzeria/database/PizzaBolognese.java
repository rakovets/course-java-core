package com.rakovets.java.junit.pizzeria.database;

import com.rakovets.java.junit.pizzeria.demo.IngredientsNames;
import com.rakovets.java.junit.pizzeria.demo.PizzaNames;

import java.util.List;

public class PizzaBolognese extends Pizza {
	public PizzaBolognese() {
		super(PizzaNames.BOLOGNESE.getPizzaName(), 12.9, List.of(IngredientsNames.MOZZARELLA.getIngredient(),
				IngredientsNames.BEEF.getIngredient(), IngredientsNames.BACON.getIngredient(),
				IngredientsNames.TOMATOES.getIngredient(), IngredientsNames.DOUGH.getIngredient()));
	}
}