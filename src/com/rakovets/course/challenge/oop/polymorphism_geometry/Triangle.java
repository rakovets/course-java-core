package com.rakovets.course.challenge.oop.polymorphism_geometry;

class Triangle extends Figures {
	Triangle(String name, double sideA, double sideB) {
		super(name, sideA, sideB);
	}

	void print() {
		System.out.printf("%s \t area = %.2fm2 \t perimeter = %.2fm \n\n", getName(), areaTriangle(), perimeterTriangle());
	}
}