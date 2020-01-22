package com.rakovets.java.solid;

import java.util.HashSet;
import java.util.Set;

public class PizzaFourSeason {
    private static double cost = 23.9;
    private static double size = 36;

    public static Set<Ingredients> getIngredientsForFourSeason() {
        Set<Ingredients> setWithIngredientsInFourSeason = new HashSet<>();
        setWithIngredientsInFourSeason.add(Ingredients.Chicken);
        setWithIngredientsInFourSeason.add(Ingredients.Mozzarella);
        setWithIngredientsInFourSeason.add(Ingredients.Tomatoes);
        setWithIngredientsInFourSeason.add(Ingredients.Thick);
        setWithIngredientsInFourSeason.add(Ingredients.With_cheese);
        return setWithIngredientsInFourSeason;
    }

    public static double getCost() {
        return cost;
    }

    public static double getSize() {
        return size;
    }
}
