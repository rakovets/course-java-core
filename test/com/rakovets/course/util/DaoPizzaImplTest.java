package com.rakovets.course.util;

import com.rakovets.pizza.dao.DaoPizzaImpl;
import com.rakovets.pizza.dao.InterfaceDaoPizza;
import com.rakovets.pizza.entity.Pizza;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DaoPizzaImplTest {
    private InterfaceDaoPizza daoPizza = new DaoPizzaImpl();

    @Test
    void testFindPizzaByName() {
        Pizza testPizza = daoPizza.findPizzaByName("Four Season");
        assert testPizza != null;
    }

    @Test
    void testGetAllPizza() {
        List<Pizza> testList = daoPizza.getAllPizza();
        assert testList.isEmpty() == false;
    }
}
