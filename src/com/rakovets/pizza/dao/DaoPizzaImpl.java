package com.rakovets.pizza.dao;

import com.rakovets.pizza.entity.Ingredients;
import com.rakovets.pizza.entity.Pizza;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DaoPizzaImpl implements InterfaceDaoPizza{

    List<Pizza> listPizza = new ArrayList<>();

    public DaoPizzaImpl() {
        Set<Ingredients> ingredientsFourSeason = new HashSet<>();
        ingredientsFourSeason.add(Ingredients.Chicken);
        ingredientsFourSeason.add(Ingredients.Mozzarella);
        ingredientsFourSeason.add(Ingredients.Cucumbers);
        ingredientsFourSeason.add(Ingredients.Thick);
        ingredientsFourSeason.add(Ingredients.With_cheese);
        Pizza pizzaFourSeason = new Pizza(18.9, "Four Season", ingredientsFourSeason);
        listPizza.add(pizzaFourSeason);

        Set<Ingredients> ingredientsForPizzaDoDo = new HashSet<>();
        ingredientsForPizzaDoDo.add(Ingredients.Sausage);
        ingredientsForPizzaDoDo.add(Ingredients.Mozzarella);
        ingredientsForPizzaDoDo.add(Ingredients.Tomatoes);
        ingredientsForPizzaDoDo.add(Ingredients.Thick);
        ingredientsForPizzaDoDo.add(Ingredients.With_cheese);
        Pizza pizzaDoDo = new Pizza(15.4, "DoDo", ingredientsForPizzaDoDo);
        listPizza.add(pizzaDoDo);

        Set<Ingredients> ingredientsPepperoni = new HashSet<>();
        ingredientsPepperoni.add(Ingredients.Sausage);
        ingredientsPepperoni.add(Ingredients.Gorgonzola);
        ingredientsPepperoni.add(Ingredients.Cucumbers);
        ingredientsPepperoni.add(Ingredients.Thin);
        ingredientsPepperoni.add(Ingredients.With_meat);
        Pizza pizzaPepperoni = new Pizza(16.9, "Pepperoni", ingredientsPepperoni);
        listPizza.add(pizzaPepperoni);

        Set<Ingredients> ingredientsItalian = new HashSet<>();
        ingredientsItalian.add(Ingredients.Sausage);
        ingredientsItalian.add(Ingredients.Mozzarella);
        ingredientsItalian.add(Ingredients.Tomatoes);
        ingredientsItalian.add(Ingredients.Thin);
        ingredientsItalian.add(Ingredients.With_cheese);
        Pizza pizzaItalian = new Pizza(15.8, "Italian", ingredientsItalian);
        listPizza.add(pizzaItalian);

        Set<Ingredients> ingredientsFourCheese = new HashSet<>();
        ingredientsFourCheese.add(Ingredients.Sausage);
        ingredientsFourCheese.add(Ingredients.Mozzarella);
        ingredientsFourCheese.add(Ingredients.Cucumbers);
        ingredientsFourCheese.add(Ingredients.Thick);
        ingredientsFourCheese.add(Ingredients.With_cheese);
        Pizza pizzaFourCheese = new Pizza(20.5, "Four Cheese", ingredientsFourCheese);
        listPizza.add(pizzaFourCheese);

        Set<Ingredients> ingredientsSweetChicken = new HashSet<>();
        ingredientsSweetChicken.add(Ingredients.Chicken);
        ingredientsSweetChicken.add(Ingredients.Mozzarella);
        ingredientsSweetChicken.add(Ingredients.Cucumbers);
        ingredientsSweetChicken.add(Ingredients.Thick);
        ingredientsSweetChicken.add(Ingredients.With_meat);
        Pizza pizzaSweetChicken = new Pizza(16.9, "Sweet Chicken", ingredientsSweetChicken);
        listPizza.add(pizzaSweetChicken);

        Set<Ingredients> ingredientsIrish = new HashSet<>();
        ingredientsIrish.add(Ingredients.Sausage);
        ingredientsIrish.add(Ingredients.Mozzarella);
        ingredientsIrish.add(Ingredients.Tomatoes);
        ingredientsIrish.add(Ingredients.Thin);
        ingredientsIrish.add(Ingredients.With_meat);
        Pizza pizzaIrish = new Pizza(16.9, "Irish", ingredientsIrish);
        listPizza.add(pizzaIrish);
    }

    @Override
    public Pizza findPizzaByName(String name) {
        return listPizza.stream()
                        .filter(pizza -> pizza.getName().equals(name))
                        .findFirst()
                        .orElse(null);
    }

    @Override
    public void addNewPizza(Pizza pizza) {
        listPizza.add(pizza);
    }

    @Override
    public List<Pizza> getAllPizza() {
        return listPizza;
    }
}
