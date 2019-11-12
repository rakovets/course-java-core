package com.rakovets.course.challenge.oop.polymorphism_geometry;

public class InputDataFigures {
	public static void main(String[] args) {
		Square square = new Square("Square", 10.5, 20.2);
		System.out.println(square.toString());
		square.print();
		Rectangle rectangle = new Rectangle("Rectangle", 11.0, 20.0);
		System.out.println(rectangle.toString());
		rectangle.print();
		Triangle triangle = new Triangle("Triangle", 3.0, 5.0);
		System.out.println(triangle.toString());
		triangle.print();
		Circle circle = new Circle("Circle", 5.0);
		System.out.println(circle.toString());
		circle.print();

		ShapeUtils.verifyNameFigure(new Rectangle("New Rectangle", 11.0, 20.0));

		Rectangle newRectangle = new Rectangle("New Rectangle", 11.0, 20.0);
		rectangle.equalsAreaFigure(newRectangle);

	}
}
