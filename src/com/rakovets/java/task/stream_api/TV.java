package com.rakovets.java.task.stream_api;

public class TV {
	private String name;
	private int year;
	private int price;
	private String diagonal;
	private String made;

	public TV(String name, int year, int price, String diagonal, String made) {
		this.name = name;
		this.year = year;
		this.price = price;
		this.diagonal = diagonal;
		this.made = made;
	}

	@Override
	public String toString() {
		return String.format("TV { name = \"%-8s\",   year = %-4d,   price = %-4d,   diagonal = \"%-3s\",   made = \"%-7s\" }",
				name, year, price, diagonal, made);
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

	public String getDiagonal() {
		return diagonal;
	}

	public String getMade() {
		return made;
	}
}

