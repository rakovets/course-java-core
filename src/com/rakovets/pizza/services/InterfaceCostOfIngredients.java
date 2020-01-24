package com.rakovets.pizza.services;

import com.rakovets.pizza.entity.Ingredients;

import java.util.Map;
import java.util.Set;

public interface InterfaceCostOfIngredients {

    Double findCostByIngredient(Ingredients ingredient);

    Set<Ingredients> getIngredientsSet();

    Map<Ingredients, Double> getIngredientsWithCost();
}
