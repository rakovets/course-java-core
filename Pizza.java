package com.rakovets.course.challenge.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private int id;
    private String name;
    private double cost;
    private List<Ingredient> pizzaIngredient;

    public Pizza(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }

    public Pizza addIngredient(Ingredient ingredient) {
        if (pizzaIngredient == null) {
            pizzaIngredient = new ArrayList<>();
        }
        pizzaIngredient.add(ingredient);
        return this;
    }

    @Override
    public String toString() {
        return String.format("Pizza: %s - amount: %.2f ", name, cost);
    }


}
