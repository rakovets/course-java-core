package com.rakovets.course.util;

import com.rakovets.pizza.entity.Pizza;
import com.rakovets.pizza.services.InterfaceDiscount;
import com.rakovets.pizza.services.InterfaceServicePizza;
import com.rakovets.pizza.services.ServicePizzaImpl;
import com.rakovets.pizza.services.SystemOfDiscount;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;


public class SystemOfDiscountTest {
    private InterfaceDiscount discount = new SystemOfDiscount();

    private InterfaceServicePizza servicePizza = new ServicePizzaImpl();

    @Test
    void testDiscountByCount() {
        double testValue = discount.discountByCountOfPizza(2, 23.5);
        assert testValue == 4.7;
    }

    @Test
    void testDiscountByWeekday() {
        double testValue = discount.discountByWeekday(2, 23.5);
        Date currentDate = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("EEEE");
        String day = formatDate.format(currentDate);
        if (day.equals("вторник")) {
            assert testValue == 4.7;
        } else {
            assert testValue == 0;
        }
    }

    @Test
    void testDiscountForExistingPizza() {
        Date currentDate = new Date();
        SimpleDateFormat formatDay = new SimpleDateFormat("EEEE");
        String day = formatDay.format(currentDate);
        Pizza testPizza = servicePizza.getPizzaByName("Irish");
        Pizza testPizzaWithCostByDiscount = discount.discountForExistingPizza(testPizza, 2);
        double cost = testPizzaWithCostByDiscount.getCost();
        cost = Math.round(cost);
        if (day.equals("вторник")) {
            assert cost == 27;
        } else {
            assert cost == 30;
        }
    }
}
