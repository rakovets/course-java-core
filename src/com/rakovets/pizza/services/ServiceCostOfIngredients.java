package com.rakovets.pizza.services;

import com.rakovets.pizza.entity.Ingredients;

import java.util.*;

public class ServiceCostOfIngredients implements InterfaceCostOfIngredients {

    private Set<Ingredients> ingredientsList = new HashSet<>();
    private Map<Ingredients, Double> mapIngredientToCost = new HashMap<>();

    @Override
    public Set<Ingredients> getIngredientsSet() {
        return ingredientsList;
    }

    public ServiceCostOfIngredients() {
        Map<Ingredients, Double> mapWithIngredients = new HashMap<>();
        mapWithIngredients.put(Ingredients.Chicken, 2.0);
        mapWithIngredients.put(Ingredients.Sausage, 2.0);
        mapWithIngredients.put(Ingredients.Mozzarella, 1.5);
        mapWithIngredients.put(Ingredients.Gorgonzola, 1.0);
        mapWithIngredients.put(Ingredients.Cucumbers, 1.0);
        mapWithIngredients.put(Ingredients.Tomatoes, 1.0);
        mapWithIngredients.put(Ingredients.Thick, 6.0);
        mapWithIngredients.put(Ingredients.Thin, 7.0);
        mapWithIngredients.put(Ingredients.With_meat, 5.0);
        mapWithIngredients.put(Ingredients.With_cheese, 4.0);
        this.ingredientsList = mapWithIngredients.keySet();
        this.mapIngredientToCost = mapWithIngredients;
    }

    @Override
    public Map<Ingredients, Double> getIngredientsWithCost() {
        return mapIngredientToCost;
    }

    @Override
    public Double findCostByIngredient(Ingredients ingredient) {
        return  getIngredientsWithCost().get(ingredient);
    }
}
