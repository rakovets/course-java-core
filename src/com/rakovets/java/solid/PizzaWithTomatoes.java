package com.rakovets.java.solid;

import java.util.HashSet;
import java.util.Set;

public class PizzaWithTomatoes {
    private static double cost = 14.9;
    private static double size = 25;

    public static Set<Ingredients> getIngredientsPizzaWithTomatoes() {
        Set<Ingredients> setWithIngredientsInPizzaWithTomatoes = new HashSet<>();
        setWithIngredientsInPizzaWithTomatoes.add(Ingredients.Chicken);
        setWithIngredientsInPizzaWithTomatoes.add(Ingredients.Mozzarella);
        setWithIngredientsInPizzaWithTomatoes.add(Ingredients.Tomatoes);
        setWithIngredientsInPizzaWithTomatoes.add(Ingredients.Thin);
        setWithIngredientsInPizzaWithTomatoes.add(Ingredients.With_cheese);
        return setWithIngredientsInPizzaWithTomatoes;
    }

    public static double getCost() {
        return cost;
    }

    public static double getSize() {
        return size;
    }
}
