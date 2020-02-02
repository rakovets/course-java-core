package com.rakovets.java.junit.pizzeria.database;

import com.rakovets.java.junit.pizzeria.demo.IngredientsNames;
import com.rakovets.java.junit.pizzeria.demo.PizzaNames;

import java.util.List;

public class PizzaMushroom extends Pizza {
	public PizzaMushroom() {
		super(PizzaNames.MUSHROOM.getPizzaName(), 5.6, List.of(IngredientsNames.MOZZARELLA.getIngredient(), IngredientsNames.CHAMPIGNON.getIngredient(),
				IngredientsNames.TOMATOES.getIngredient(), IngredientsNames.DOUGH.getIngredient()));
	}
}