package com.rakovets.java.solid;

import java.util.HashSet;
import java.util.Set;

public class PizzaWithMeatBoard {
    private static double cost = 25;
    private static double size = 36;

    public static Set<Ingredients> getIngredientsPizzaWithMeatBoard() {
        Set<Ingredients> setWithIngredientsInPizzaWithMeatBoard = new HashSet<>();
        setWithIngredientsInPizzaWithMeatBoard.add(Ingredients.Sausage);
        setWithIngredientsInPizzaWithMeatBoard.add(Ingredients.Mozzarella);
        setWithIngredientsInPizzaWithMeatBoard.add(Ingredients.Tomatoes);
        setWithIngredientsInPizzaWithMeatBoard.add(Ingredients.Thin);
        setWithIngredientsInPizzaWithMeatBoard.add(Ingredients.With_meat);
        return setWithIngredientsInPizzaWithMeatBoard;
    }

    public static double getCost() {
        return cost;
    }

    public static double getSize() {
        return size;
    }
}
