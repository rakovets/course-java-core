package com.rakovets.java.task.stream_api;

import java.util.Comparator;
import java.util.List;

public class TVDemo {
	public static void main(String[] args) {
		List<TV> tv = List.of(new TV("LG", 2015, 150, "45'", "China"),
				new TV("Samsung", 2019, 320, "55'", "Vietnam"),
				new TV("Sony", 2017, 200, "65'", "Japan"),
				new TV("Gorizont", 2018, 1500, "55'", "Belarus"),
				new TV("Philips", 2017, 700, "65'", "Germany"),
				new TV("Sony", 2019, 700, "45'", "Japan"));

		System.out.println("Все телевизоры: ");
		tv.forEach(unit -> System.out.println(unit.toString()));

		System.out.println("\nТелевизоры с диагональю \"55'\": ");
		tv.stream()
				.filter(unit -> unit.getDiagonal().equals("55'"))
				.forEach(System.out::println);

		System.out.println("\nТелевизоры \"Japan\": ");
		tv.stream()
				.filter(unit -> unit.getMade().equals("Japan"))
				.forEach(System.out::println);

		System.out.println("\nТелевизоры \"2019 года\": ");
		tv.stream()
				.filter(unit -> unit.getYear() == 2019)
				.forEach(System.out::println);

		System.out.println("\nТелевизоры \"дороже 500\": ");
		tv.stream()
				.filter(unit -> unit.getPrice() > 500)
				.forEach(System.out::println);

		System.out.println("\nТелевизоры отсортированы по цене по возрастанию: ");
		tv.stream()
				.sorted(Comparator.comparingInt(TV::getPrice))
				.forEach(System.out::println);

		System.out.println("\nТелевизоры отсортированы по цене по убыванию: ");
		tv.stream()
				.sorted(new TVComparatorPriceBack())
				.forEach(System.out::println);

		System.out.println("\nТелевизоры отсортированы по диагонали по возрастанию: ");
		tv.stream()
				.sorted(Comparator.comparing(TV::getDiagonal))
				.forEach(System.out::println);

		System.out.println("\nТелевизоры отсортированы по диагонали по убыванию: ");
		tv.stream()
				.sorted(new TVComparatorDiagonalBack())
				.forEach(System.out::println);
	}
}
