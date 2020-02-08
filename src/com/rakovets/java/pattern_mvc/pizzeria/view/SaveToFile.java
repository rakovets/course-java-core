package com.rakovets.java.pattern_mvc.pizzeria.view;

import com.rakovets.java.pattern_mvc.pizzeria.database.Pizza;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {

	public void saveFilePizza(String todayDate, Pizza pizza, int number, double cost, double discountNumberPizza) {
		String textInfoOrder = String.format("\nЗаказ: Пицца %s, количество %d шт., стоимость %d * %.1f - скидка %.1f = %.1f руб.",
				pizza.getName(), number, number, pizza.getPrice(), discountNumberPizza, cost);

		try {
			FileWriter fileWriter = new FileWriter("textInfoOrder.txt", true);
			fileWriter.write("\n" + todayDate);
			fileWriter.write(textInfoOrder);
			fileWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}