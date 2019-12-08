package com.rakovets.java.task.collections.list;

public abstract class Car {
	String brand;
	String model;
	String color;
	int yearManufacture;
	int registrationNumber;

	public Car(String brand, String model, String color, int yearManufacture, int registrationNumber) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.yearManufacture = yearManufacture;
		this.registrationNumber = registrationNumber;
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				", model='" + model + '\'' +
				", color='" + color + '\'' +
				", yearManufacture=" + yearManufacture +
				", registrationNumber=" + registrationNumber +
				'}';
	}
}
