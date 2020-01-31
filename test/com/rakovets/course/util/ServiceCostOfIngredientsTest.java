package com.rakovets.course.util;

import com.rakovets.pizza.entity.Ingredients;
import com.rakovets.pizza.services.InterfaceCostOfIngredients;
import com.rakovets.pizza.services.ServiceCostOfIngredients;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

public class ServiceCostOfIngredientsTest {
    private InterfaceCostOfIngredients costOfIngredients = new ServiceCostOfIngredients();

    @Test
    void testGetIngredientsWithCost() {
        Map<Ingredients, Double> testMap = costOfIngredients.getIngredientsWithCost();
        assert testMap.isEmpty() == false;
    }

    @Test
    void testGetIngredientsSet() {
        Set<Ingredients> testSet = costOfIngredients.getIngredientsSet();
        assert testSet.isEmpty() == false;
    }

    @Test
    void testFindCostByIngredient() {
        double testValue = costOfIngredients.findCostByIngredient(Ingredients.Thin);
        assert testValue == 7.0;
    }
}
