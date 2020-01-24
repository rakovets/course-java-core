package com.rakovets.pizza.services;

import com.rakovets.pizza.entity.Ingredients;
import com.rakovets.pizza.entity.Pizza;

import java.util.Set;

public interface InterfaceServicePizza {

    Pizza createPizzaByIngredients(String name, Set<Ingredients> ingredients, int count);

    Pizza getPizzaByName(String name);

    Double findCostByIngredient(Ingredients ingredient);
}
