package com.rakovets.pizza.services;

import com.rakovets.pizza.dao.DaoPizzaImpl;
import com.rakovets.pizza.dao.InterfaceDaoPizza;
import com.rakovets.pizza.entity.Ingredients;
import com.rakovets.pizza.entity.Pizza;

import java.util.Set;

public class ServicePizzaImpl implements InterfaceServicePizza{
    private ServiceCostOfIngredients serviceCostOfIngredients = new ServiceCostOfIngredients();
    private SystemOfDiscount systemOfDiscount = new SystemOfDiscount();

    private InterfaceDaoPizza daoPizza = new DaoPizzaImpl();

    @Override
    public Pizza createPizzaByIngredients(String name, Set<Ingredients> ingredients, int count) {
        double cost = 0;
        for (Ingredients ingredient : ingredients) {
            cost += serviceCostOfIngredients.findCostByIngredient(ingredient);
        }
        double costOfAll = cost * count;
        costOfAll -= (systemOfDiscount.discountByCountOfPizza(count, cost) + systemOfDiscount.discountByWeekday(count, cost));
        return new Pizza(costOfAll, name, ingredients);
    }

    @Override
    public Pizza getPizzaByName(String name) {
        Pizza pizza =  daoPizza.findPizzaByName(name);
        if(pizza == null) {
            throw new IllegalStateException("Pizza not found by name = " + name);
        }
        return pizza;
    }

    @Override
    public Double findCostByIngredient(Ingredients ingredient) {
        return serviceCostOfIngredients.findCostByIngredient(ingredient);
    }
}
