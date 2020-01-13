package com.rakovets.java.io;

import java.io.Serializable;

class Computer implements Serializable {
	private String name;
	private int warranty;
	private boolean updated;

	public Computer(String name, int age, boolean updated) {
		this.name = name;
		this.warranty = age;
		this.updated = updated;
	}

	public String getName() {
		return name;
	}

	public int getWarranty() {
		return warranty;
	}

	public boolean getUpdated() {
		return updated;
	}
}

