package com.rakovets.java.pattern_mvc.pizzeria.models;

import com.rakovets.java.pattern_mvc.pizzeria.database.Pizza;

import java.util.Map;

public class SetOrders {

	public void setOrdersPizza(Pizza pizza, Map<String, Integer> ordersPizza, int numberPizza) {
		if (!ordersPizza.containsKey(pizza.getName())) {
			ordersPizza.put(pizza.getName(), 0);
		}
		ordersPizza.put(pizza.getName(), ordersPizza.get(pizza.getName()) + numberPizza);
	}
}