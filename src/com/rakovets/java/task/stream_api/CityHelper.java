package com.rakovets.java.task.stream_api;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CityHelper {
	public static void main(String[] args) {
		List<String> cities = List.of("Минск", "Витебск", "Могилев", "Гомель", "Брест", "Гродно", "Минск");
		cities.forEach(unit -> System.out.printf("%s ", unit));
		List citiesLongerMoreSixLetters = cities.stream()
				.filter(unit -> unit.length() > 6)
				.collect(Collectors.toList());
		System.out.println("\nГорода с названием длиннее шести символов: " + citiesLongerMoreSixLetters);

		List<String> citiesStartsWith = cities.stream()
				.filter(unit -> unit.startsWith("М"))
				.collect(Collectors.toList());
		System.out.println("Города, которые начинаются на букву \"М\": " + citiesStartsWith);

		System.out.print("Введите город для поиска: ");
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();
		long countEnterUser = cities.stream()
				.filter(unit -> unit.equalsIgnoreCase(value))
				.count();
		System.out.printf("Город \"%s\" встречается %d раз(а)", value, countEnterUser);
	}
}

