package com.rakovets.java.solid;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SaveToFile {
	String textInfoOrder;
	FileWriter fileWriter = null;
	LocalDateTime dateTime = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	String time;

	void saveFilePizza(String pizza, int number, double price, double cost, double discountNumberPizza) {
		time = dateTime.format(formatter);
		textInfoOrder = String.format("\nЗаказ: Пицца %s, количество %d шт., стоимость %d * %.1f - скидка %.1f = %.1f руб.",
				pizza, number, number, price, discountNumberPizza, cost);

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
