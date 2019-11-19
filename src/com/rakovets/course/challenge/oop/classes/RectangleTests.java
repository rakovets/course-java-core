package com.rakovets.course.challenge.oop.classes;

public class RectangleTests {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(6, 4));
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());
	}
}
