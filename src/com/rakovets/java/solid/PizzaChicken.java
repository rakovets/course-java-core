package com.rakovets.java.solid;

import java.util.HashSet;
import java.util.Set;

public class PizzaChicken {
    private static double cost = 14.9;
    private static double size = 18;

    public static Set<Ingredients> getIngredientsForPizzaChicken() {
        Set<Ingredients> setWithIngredientsInPizzaChicken = new HashSet<>();
        setWithIngredientsInPizzaChicken.add(Ingredients.Chicken);
        setWithIngredientsInPizzaChicken.add(Ingredients.Gorgonzola);
        setWithIngredientsInPizzaChicken.add(Ingredients.Cucumbers);
        setWithIngredientsInPizzaChicken.add(Ingredients.Thick);
        setWithIngredientsInPizzaChicken.add(Ingredients.With_meat);
        return setWithIngredientsInPizzaChicken;
    }

    public static double getCost() {
        return cost;
    }

    public static double getSize() {
        return size;
    }
}
