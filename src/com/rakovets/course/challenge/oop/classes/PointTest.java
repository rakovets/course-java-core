package com.rakovets.course.challenge.oop.classes;

public class PointTest {
	public static void main(String[] args) {
		Point point1 = new Point(30.0, 30.0);
		Point point2 = new Point(100.0, 100.0);
		System.out.printf("Distance between point1 and point2 = %.2f m", point1.distance(point2));
	}
}

