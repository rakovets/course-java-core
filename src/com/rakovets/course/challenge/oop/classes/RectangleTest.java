package com.rakovets.course.challenge.oop.classes;

public class RectangleTest {
	public static void main(String[] args) {
		Point point1 = new Point(30.0, 50.0);
		Point point2 = new Point(50.0, 30.0);
		Rectangle points = new Rectangle(point1, point2);
		System.out.printf("Area of the triangle = %.2f m2\n", points.area());
		System.out.printf("Perimeter of the triangle = %.2f m", points.perimeter());
	}
}
