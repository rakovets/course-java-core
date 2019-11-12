package com.rakovets.course.challenge.oop.polymorphism_geometry;

public class ShapeUtils extends Figures {
	ShapeUtils(String name, double sideA, double sideB) {
		super(name, sideA, sideB);
	}

	static void verifyNameFigure(Figures figure) {
		if (figure instanceof Triangle) {
			System.out.println("Figure - triangle\n");
		} else if (figure instanceof Rectangle) {
			System.out.println("Figure - rectangle\n");
		}
	}
}
