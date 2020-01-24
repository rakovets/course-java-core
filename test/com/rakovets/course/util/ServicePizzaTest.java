package com.rakovets.course.util;

import com.rakovets.pizza.dao.DaoPizzaImpl;
import com.rakovets.pizza.dao.InterfaceDaoPizza;
import com.rakovets.pizza.entity.Ingredients;
import com.rakovets.pizza.entity.Pizza;
import com.rakovets.pizza.services.InterfaceServicePizza;
import com.rakovets.pizza.services.ServicePizzaImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class ServicePizzaTest {

    private InterfaceServicePizza interfaceServicePizza = new ServicePizzaImpl();

    private InterfaceDaoPizza interfaceDaoPizza = new DaoPizzaImpl();

    @BeforeEach
    public void beforeTest() {
        Set<Ingredients> ingredients = new HashSet<>();
        ingredients.add(Ingredients.Chicken);
        ingredients.add(Ingredients.Mozzarella);
        Pizza pizza = new Pizza(10, "Four Season", ingredients);
        interfaceDaoPizza.getAllPizza().add(pizza);
    }

    @Test
    public void testPizza() {
        Pizza pizza = interfaceServicePizza.getPizzaByName("Four Season");
        assert pizza != null;
    }
}
