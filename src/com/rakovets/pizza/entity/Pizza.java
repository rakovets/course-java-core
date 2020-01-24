package com.rakovets.pizza.entity;

import java.util.HashSet;
import java.util.Set;

public class Pizza {

    private double cost;
    private String name;
    private Set<Ingredients> setWithIngredientsInPizza = new HashSet<>();

    public double getCost() {
        return cost;
    }


    public Set<Ingredients> getSetWithIngredientsInPizza() {
        return setWithIngredientsInPizza;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public void setSetWithIngredientsInPizza(Set<Ingredients> setWithIngredientsInPizza) {
        this.setWithIngredientsInPizza = setWithIngredientsInPizza;
    }

    public Pizza(double cost, String name, Set<Ingredients> setWithIngredientsInPizza) {
        this.cost = cost;
        this.name = name;
        this.setWithIngredientsInPizza = setWithIngredientsInPizza;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", setWithIngredientsInPizza=" + setWithIngredientsInPizza +
                '}';
    }
}
