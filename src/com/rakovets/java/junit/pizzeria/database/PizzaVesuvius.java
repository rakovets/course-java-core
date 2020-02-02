package com.rakovets.java.junit.pizzeria.database;

import com.rakovets.java.junit.pizzeria.demo.IngredientsNames;
import com.rakovets.java.junit.pizzeria.demo.PizzaNames;

import java.util.List;

public class PizzaVesuvius extends Pizza {
	public PizzaVesuvius() {
		super(PizzaNames.VESUVIUS.getPizzaName(), 6.3, List.of(IngredientsNames.MOZZARELLA.getIngredient(), IngredientsNames.HAM.getIngredient(),
				IngredientsNames.TOMATOES.getIngredient(), IngredientsNames.DOUGH.getIngredient()));
	}
}
