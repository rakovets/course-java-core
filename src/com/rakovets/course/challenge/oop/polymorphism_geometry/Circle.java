package com.rakovets.course.challenge.oop.polymorphism_geometry;

class Circle {
	private String name;
	private double radius;

	Circle(String name, double radius) {
		this.name = name;
		this.radius = radius;
	}

	String getName() {
		return name;
	}

	double getRadius() {
		return radius;
	}

	double areaCircle() {
		double result = Math.PI * Math.pow(getRadius(), 2);
		return result;
	}

	double perimeterCircle() {
		double result = Math.PI * getRadius() * 2;
		return result;
	}

	void print() {
		System.out.printf("%s \t area = %.2fm2 \t perimeter = %.2fm \n\n", getName(), areaCircle(), perimeterCircle());
	}

	@Override
	public String toString() {
		return String.format("Class %s:", getName());
	}
}
