package com.rakovets.course.java.core.practice.oop.classesandobjects;

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

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point newPoint) {
        double distance;
        distance = Math.sqrt((newPoint.x - this.x) * (newPoint.x - this.x) + (newPoint.y - this.y) * (newPoint.y - this.y));
        return distance;
    }
}
