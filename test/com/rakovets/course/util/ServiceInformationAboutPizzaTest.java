package com.rakovets.course.util;

import com.rakovets.pizza.entity.Ingredients;
import com.rakovets.pizza.services.InterfaceServiceInformation;
import com.rakovets.pizza.services.ServiceInformationAboutPizzaForManager;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class ServiceInformationAboutPizzaTest {
    private InterfaceServiceInformation information = new ServiceInformationAboutPizzaForManager();

    @Test
    void testGetMapWithIngredientsAndCount() {
        Map<Ingredients, Integer> testMap = information.getMapWithIngredientsAndCount();
        assert testMap.isEmpty() == false;
    }

    @Test
    void testReduceCountOfIngredient() {
        int testCountOfIngredient = information.reduceCountOfIngredient(Ingredients.With_meat);
        assert testCountOfIngredient == 19;
    }
}
