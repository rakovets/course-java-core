package com.rakovets.pizza.dao;

import com.rakovets.pizza.entity.Pizza;

import java.util.List;

public interface InterfaceDaoPizza {

    Pizza findPizzaByName(String name);

    void addNewPizza(Pizza pizza);

    List<Pizza> getAllPizza();
}
