package com.rakovets.course.challenge.oop.classes;

public class Rectangle {
	private Point pointLT;
	private Point pointRU;

	Rectangle(Point point1, Point point2) {
		this.pointLT = point1;
		this.pointRU = point2;
	}

	public Point getPointLT() {
		return this.pointLT;
	}

	public Point getPointRU() {
		return this.pointRU;
	}

	double area() {
		double area = (Math.abs(getPointRU().getX() - getPointLT().getX())) * Math.abs((getPointLT().getY() - getPointRU().getY()));
		return area;
	}

	double perimeter() {
		double perimeter = (Math.abs(getPointRU().getX() - getPointLT().getX()) + Math.abs(getPointLT().getY() - getPointRU().getY())) * 2;
		return perimeter;
	}
}
