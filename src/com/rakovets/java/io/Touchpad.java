package com.rakovets.java.io;

import java.io.Serializable;

public class Touchpad implements Serializable {
	private String model;
	private String color;
	private int weight;

	public Touchpad(String model, String color, int weight) {
		this.model = model;
		this.color = color;
		this.weight = weight;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return String.format("\nTouchpad: \nModel - %s\nColor - %s\nWeight - %d", getModel(), getColor(), getWeight());
	}
}
