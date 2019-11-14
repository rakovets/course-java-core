package com.rakovets.course.challenge.oop.classes;

public class Point {
	private double x;
	private double y;

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double getX() {
		return this.x;
	}

	double getY() {
		return this.y;
	}

	double distance(Point point2) {
		double distance = Math.sqrt(Math.pow(this.x - point2.getX(), 2) + Math.pow(this.y - point2.getY(), 2));
		return distance;
	}
}
