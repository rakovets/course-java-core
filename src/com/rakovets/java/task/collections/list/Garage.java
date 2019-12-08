package com.rakovets.java.task.collections.list;

import java.util.HashMap;
import java.util.Map;

public class Garage {
	HashMap<Car, Integer> garage = new HashMap();

	void park(Car car, int count) {
//		int countGarage = garage.get(car) + count;
		garage.put(car, count);

	}

	void leave(Car car, int count) {
		int countGarage = garage.get(car) - count;
		garage.put(car, countGarage);
	}

	void getCountString() {
		for (Map.Entry<Car, Integer> car : garage.entrySet()) {
			System.out.println(car);
		}
	}

	void getCountBrand(String brand) {
		System.out.println("");
		for (Map.Entry<Car, Integer> car : garage.entrySet()) {
			if (car.getKey().brand == brand) {
				System.out.println(car);
			}
		}
	}

	void getCountBrandAndModel(String brand, String model) {
		System.out.println("");
		for (Map.Entry<Car, Integer> car : garage.entrySet()) {
			if (car.getKey().brand == brand && car.getKey().model == model) {
				System.out.println(car);
			}
		}
	}

	@Override
	public String toString() {
		return "Garage{" +
				"garage=" + garage +
				'}';
	}
}
