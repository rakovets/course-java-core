package com.rakovets.java.solid;

import java.util.HashSet;
import java.util.Set;

public class PizzaWithCheese {
    private static double cost = 25.3;
    private static double size = 28;

    public static Set<Ingredients> getIngredientsPizzaWithCheese() {
        Set<Ingredients> setWithIngredientsInPizzaWithCheese = new HashSet<>();
        setWithIngredientsInPizzaWithCheese.add(Ingredients.Sausage);
        setWithIngredientsInPizzaWithCheese.add(Ingredients.Mozzarella);
        setWithIngredientsInPizzaWithCheese.add(Ingredients.Tomatoes);
        setWithIngredientsInPizzaWithCheese.add(Ingredients.Thick);
        setWithIngredientsInPizzaWithCheese.add(Ingredients.With_cheese);
        return setWithIngredientsInPizzaWithCheese;
    }

    public static double getCost() {
        return cost;
    }

    public static double getSize() {
        return size;
    }
}
