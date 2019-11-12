package com.rakovets.course.challenge.oop.classes;

public class PointTests {
	public static void main(String[] args) {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(1, 1);
		System.out.println(p1.getX() + " " + p1.getY());
		System.out.println(p1.distance(p2));
		p2.setX(0);
		System.out.println(p1.distance(p2));
	}
}
