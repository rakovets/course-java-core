package com.rakovets.java.junit.pizzeria.view;

import com.rakovets.java.junit.pizzeria.database.Pizza;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SaveToFile {
	private String textInfoOrder;
	private FileWriter fileWriter = null;
	private LocalDateTime dateTime = LocalDateTime.now();
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	private String time;

	public void saveFilePizza(Pizza pizza, int number, double cost, double discountNumberPizza) {
		time = dateTime.format(formatter);
		textInfoOrder = String.format("\nЗаказ: Пицца %s, количество %d шт., стоимость %d * %.1f - скидка %.1f = %.1f руб.",
				pizza.getName(), number, number, pizza.getPrice(), discountNumberPizza, cost);

		try {
			fileWriter = new FileWriter("textInfoOrder.txt", true);
			fileWriter.write("\n" + time);
			fileWriter.write(textInfoOrder);
			fileWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}