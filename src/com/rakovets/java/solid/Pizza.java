package com.rakovets.java.solid;

import java.util.HashSet;
import java.util.Set;

public abstract class Pizza {
    private double cost;
    private double size;
    private Set<Ingredients> setWithIngredientsInPizza = new HashSet<>();

    public Pizza(int cost, int size, Set<Ingredients> setWithIngredientsInPizza) {
        this.cost = cost;
        this.size = size;
        this.setWithIngredientsInPizza = setWithIngredientsInPizza;
    }


    public double getCost() {
        return cost;
    }

    public double getSize() {
        return size;
    }

    public Set<Ingredients> getSetWithIngredientsInPizza() {
        return setWithIngredientsInPizza;
    }
}
