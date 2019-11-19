package com.rakovets.course.challenge.oop.classes;

public class Rectangle {
	private Point pointLT;
	private Point pointRU;
	private Point pointRT;
	private Point pointLU;

	public Rectangle(Point pointLT, Point pointRU) {
		this.pointLT = pointLT;
		this.pointRU = pointRU;
		pointRT = new Point(pointRU.getX(), pointLT.getY());
		pointLU = new Point(pointLT.getX(), pointRU.getY());
	}

	public Point getPointLT() {
		return pointLT;
	}

	public void setPointLT(Point pointLT) {
		this.pointLT = pointLT;
	}

	public Point getPointRU() {
		return pointRU;
	}

	public void setPointRU(Point pointRU) {
		this.pointRU = pointRU;
	}

	public double getArea() {
		double area;
		area = pointLT.distance(pointLU) * pointLT.distance(pointRT);
		return area;
	}

	public double getPerimeter() {
		double perimeter;
		perimeter = (pointLT.distance(pointLU) + pointLT.distance(pointRT)) * 2;
		return perimeter;
	}
}
