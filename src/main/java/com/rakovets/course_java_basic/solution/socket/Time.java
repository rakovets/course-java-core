package main.java.com.rakovets.course_java_basic.solution.socket;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {

	public String dateTime() {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		return dateTime.format(formatter);
	}
}