package com.rakovets.java.solid;

import java.util.List;

public class PizzaBarbecue implements IngredientsName {
	private String name = "'Барбекю'";
	private double price = 11.9;
	List<String> indigentsPizzaBarbecue = List.of(mozzarellaName, chickenFilletName, baconName, tomatoesName, doughName);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	void setNumberIngredients(NumberIngredients numberIngredients, int numberPizza) {
		numberIngredients.setMozzarella(numberPizza);
		numberIngredients.setChickenFillet(numberPizza);
		numberIngredients.setBacon(numberPizza);
		numberIngredients.setTomatoes(numberPizza);
		numberIngredients.setDough(numberPizza);
	}
}
