package com.rakovets.course.challenge.oop.classes;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distance(Point p) {
		double distance;
		distance = Math.sqrt(Math.pow(y - p.y, 2) + Math.pow(x - p.x, 2));
		return distance;
	}
}
