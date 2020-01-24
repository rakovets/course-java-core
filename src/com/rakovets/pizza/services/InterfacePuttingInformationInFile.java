package com.rakovets.pizza.services;

import com.rakovets.pizza.entity.Ingredients;

import java.util.Set;

public interface InterfacePuttingInformationInFile {

    void putOrderInFile(String name, Set<Ingredients> ingredients, double cost, int count);
}
