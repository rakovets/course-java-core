package com.rakovets.java.task.stream_api;

public class Car {
	private String name;
	private int year;
	private int price;
	private String color;
	private int volume;


	public Car(String name, int year, int price, String color, int volume) {
		this.name = name;
		this.year = year;
		this.price = price;
		this.color = color;
		this.volume = volume;
	}

	@Override
	public String toString() {
		return String.format("Car { name = \"%-7s\",   year = %-4d,   price = %-4d,   color = \"%-6s\",   volume = %d }",
				name, year, price, color, volume);
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public int getVolume() {
		return volume;
	}
}
