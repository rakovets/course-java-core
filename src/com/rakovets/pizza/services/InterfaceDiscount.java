package com.rakovets.pizza.services;

import com.rakovets.pizza.entity.Pizza;

public interface InterfaceDiscount {

    double discountByCountOfPizza(int countOfPizza, double cost);

    double discountByWeekday(int countOfPizza, double cost);

    Pizza discountForExistingPizza(Pizza currentPizza, int count);
}
