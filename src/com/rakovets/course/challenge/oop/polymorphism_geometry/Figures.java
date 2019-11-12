package com.rakovets.course.challenge.oop.polymorphism_geometry;

abstract class Figures {
	private String name;
	private double sideA;
	private double sideB;

	Figures(String name, double sideA, double sideB) {
		this.name = name;
		this.sideA = sideA;
		this.sideB = sideB;
	}

	String getName() {
		return name;
	}

	double getSideA() {
		return sideA;
	}

	double getSideB() {
		return sideB;
	}

	double areaSquare() {
		double result = getSideA() * getSideB();
		return result;
	}

	double perimeterSquare() {
		double result = (getSideA() + getSideB()) * 2;
		return result;
	}

	double areaTriangle() {
		double result = getSideA() * getSideB() / 2;
		return result;
	}

	double perimeterTriangle() {
		double result = getSideA() + getSideB() + (Math.sqrt(Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2)));
		return result;
	}

	void equalsAreaFigure(Figures figure) {
		if (areaSquare() == figure.areaSquare()) {
			System.out.println("Areas figures are EQUAL");
		} else {
			System.out.println("Areas figures NOT are EQUAL");
		}
	}

	@Override
	public String toString() {
		return String.format("Class %s:", getName());
	}
}
