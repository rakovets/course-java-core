package com.rakovets.pizza.services;

import com.rakovets.pizza.entity.Ingredients;

import java.util.HashMap;
import java.util.Map;

public class ServiceInformationAboutPizzaForManager implements InterfaceServiceInformation{
    private int countOfPizza = 0;
    private double countOfMoney = 0;
    private Map<Ingredients, Integer> mapWithIngredientsAndCount = new HashMap<>();

    public ServiceInformationAboutPizzaForManager() {
        Map<Ingredients, Integer> mapWithIngredients = new HashMap<>();
        mapWithIngredients.put(Ingredients.Chicken, 20);
        mapWithIngredients.put(Ingredients.Sausage, 20);
        mapWithIngredients.put(Ingredients.Mozzarella, 20);
        mapWithIngredients.put(Ingredients.Gorgonzola, 20);
        mapWithIngredients.put(Ingredients.Cucumbers, 20);
        mapWithIngredients.put(Ingredients.Tomatoes, 20);
        mapWithIngredients.put(Ingredients.Thick, 20);
        mapWithIngredients.put(Ingredients.Thin, 20);
        mapWithIngredients.put(Ingredients.With_meat, 20);
        mapWithIngredients.put(Ingredients.With_cheese, 20);
        this.mapWithIngredientsAndCount = mapWithIngredients;
    }

    @Override
    public void showIngredientsWithCount(Map<Ingredients, Integer> map) {
        for (Map.Entry<Ingredients, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public Map<Ingredients, Integer> getMapWithIngredientsAndCount() {
        return mapWithIngredientsAndCount;
    }

    @Override
    public int reduceCountOfIngredient(Ingredients ingredient) {
        int countAfterReduce = getMapWithIngredientsAndCount().get(ingredient) - 1;
        getMapWithIngredientsAndCount().replace(ingredient, countAfterReduce);
        if (countAfterReduce <= 5) {
            System.out.println(ingredient + "finish!");
        }
        return countAfterReduce;
    }

    @Override
    public void addCountOfOrderingPizza(int count) {
        setCountOfPizza(getCountOfPizza() + count);
    }

    public int getCountOfPizza() {
        return countOfPizza;
    }

    public void setCountOfPizza(int countOfPizza) {
        this.countOfPizza = countOfPizza;
    }

    @Override
    public void addCountOfMoney(double money) {
        setCountOfMoney(getCountOfMoney() + money);
    }

    @Override
    public double getCountOfMoney() {
        return countOfMoney;
    }

    public void setCountOfMoney(double countOfMoney) {
        this.countOfMoney = countOfMoney;
    }
}
