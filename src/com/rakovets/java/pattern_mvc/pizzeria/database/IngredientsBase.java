package com.rakovets.java.pattern_mvc.pizzeria.database;

import java.util.HashMap;
import java.util.Map;

public class IngredientsBase {
	public Map<String, Integer> getMapNumberIngredients() {
		Map<String, Integer> mapNumberIngredients = new HashMap<>();
		mapNumberIngredients.put(IngredientsNames.TOMATOES.getIngredient(), 50);
		mapNumberIngredients.put(IngredientsNames.DOUGH.getIngredient(), 50);
		mapNumberIngredients.put(IngredientsNames.CHICKEN.getIngredient(), 50);
		mapNumberIngredients.put(IngredientsNames.BACON.getIngredient(), 50);
		mapNumberIngredients.put(IngredientsNames.MOZZARELLA.getIngredient(), 50);
		mapNumberIngredients.put(IngredientsNames.BEEF.getIngredient(), 50);
		mapNumberIngredients.put(IngredientsNames.EGG.getIngredient(), 50);
		mapNumberIngredients.put(IngredientsNames.CUCUMBER.getIngredient(), 50);
		mapNumberIngredients.put(IngredientsNames.CHEDDAR.getIngredient(), 50);
		mapNumberIngredients.put(IngredientsNames.PARMESAN.getIngredient(), 50);
		mapNumberIngredients.put(IngredientsNames.JUGAS.getIngredient(), 50);
		mapNumberIngredients.put(IngredientsNames.CHAMPIGNON.getIngredient(), 50);
		mapNumberIngredients.put(IngredientsNames.PEPPER.getIngredient(), 50);
		mapNumberIngredients.put(IngredientsNames.PEPPERONI.getIngredient(), 50);
		mapNumberIngredients.put(IngredientsNames.HAM.getIngredient(), 50);
		return mapNumberIngredients;
	}
}