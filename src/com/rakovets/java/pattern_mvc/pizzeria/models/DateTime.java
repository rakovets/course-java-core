package com.rakovets.java.pattern_mvc.pizzeria.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
	private LocalDateTime dateTime = LocalDateTime.now();
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE HH:mm:ss");

	public String toDay() {
		return dateTime.format(DateTimeFormatter.ofPattern("EEEE"));
	}

	public String todayDate() {
		return dateTime.format(formatter);
	}
}
