package com.rakovets.java.solid;

import java.util.HashSet;
import java.util.Set;

public class PizzaDoDo {
    private static double cost = 23.9;
    private static double size = 36;

    public static Set<Ingredients> getIngredientsForPizzaDoDo() {
        Set<Ingredients> setWithIngredientsInDoDo = new HashSet<>();
        setWithIngredientsInDoDo.add(Ingredients.Chicken);
        setWithIngredientsInDoDo.add(Ingredients.Gorgonzola);
        setWithIngredientsInDoDo.add(Ingredients.Cucumbers);
        setWithIngredientsInDoDo.add(Ingredients.Thick);
        setWithIngredientsInDoDo.add(Ingredients.With_meat);
        return setWithIngredientsInDoDo;
    }

    public static double getCost() {
        return cost;
    }

    public static double getSize() {
        return size;
    }
}
