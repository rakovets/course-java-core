package com.rakovets.java.task.stream_api;

import java.util.List;

public class CarGarage {
	public static void main(String[] args) {
		List<Car> cars = List.of(new Car("TOYOTA", 2016, 5500, "White", 4),
				new Car("NISSAN", 2017, 7000, "Red", 5),
				new Car("HYUNDAI", 2019, 9000, "Black", 4),
				new Car("DODGE", 2015, 6000, "White", 3),
				new Car("RENAULT", 2018, 1500, "Gray", 2));

		System.out.println("Все автомобили: ");
		cars.forEach(unit -> System.out.println(unit.toString()));

		System.out.println("\nАвтомобили белого цвета: ");
		cars.stream()
				.filter(unit -> unit.getColor().equals("White"))
				.forEach(System.out::println);

		System.out.println("\nАвтомобили с объемом двигателя \"4\": ");
		cars.stream()
				.filter(unit -> unit.getVolume() == 4)
				.forEach(System.out::println);

		System.out.println("\nАвтомобили дороже \"6000\": ");
		cars.stream()
				.filter(unit -> unit.getPrice() > 6000)
				.forEach(System.out::println);

		System.out.println("\nАвтомобили с годом выпуска от \"2016\" до \"2018\" включительно: ");
		cars.stream()
				.filter(unit -> unit.getYear() >= 2016 && unit.getYear() <= 2018)
				.forEach(System.out::println);
	}
}
