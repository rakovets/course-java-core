package com.rakovets.java.solid;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Discount {
	double discount;
	String day;

	double discountNumberPizza(double numberPizza, double price) {
		if (numberPizza >= 3) {
			discount = numberPizza * price * 0.1;
		} else discount = discountDayPizza(numberPizza, price);
		return discount;
	}

	double discountDayPizza(double numberPizza, double price) {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
		day = dateTime.format(formatter);
		if (day.equals("суббота") || day.equals("воскресенье")) {
			discount = 0;
		} else {
			discount = numberPizza * price * 0.1;
		}
		return discount;
	}
}
