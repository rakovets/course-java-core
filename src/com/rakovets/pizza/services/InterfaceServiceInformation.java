package com.rakovets.pizza.services;

import com.rakovets.pizza.entity.Ingredients;

import java.util.Map;

public interface InterfaceServiceInformation {

    void addCountOfOrderingPizza(int count);

    int getCountOfPizza();

    void addCountOfMoney(double money);

    double getCountOfMoney();

    int reduceCountOfIngredient(Ingredients ingredient);

    Map<Ingredients, Integer> getMapWithIngredientsAndCount();

    void showIngredientsWithCount(Map<Ingredients, Integer> map);
}
