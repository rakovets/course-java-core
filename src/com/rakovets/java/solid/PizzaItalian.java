package com.rakovets.java.solid;

import java.util.HashSet;
import java.util.Set;

public class PizzaItalian {
    private static double cost = 23.9;
    private static double size = 36;

    public static Set<Ingredients> getIngredientsForPizzaItalian() {
        Set<Ingredients> setWithIngredientsInPizzaItalian = new HashSet<>();
        setWithIngredientsInPizzaItalian.add(Ingredients.Sausage);
        setWithIngredientsInPizzaItalian.add(Ingredients.Gorgonzola);
        setWithIngredientsInPizzaItalian.add(Ingredients.Cucumbers);
        setWithIngredientsInPizzaItalian.add(Ingredients.Thick);
        setWithIngredientsInPizzaItalian.add(Ingredients.With_cheese);
        return setWithIngredientsInPizzaItalian;
    }

    public static double getCost() {
        return cost;
    }

    public static double getSize() {
        return size;
    }
}
