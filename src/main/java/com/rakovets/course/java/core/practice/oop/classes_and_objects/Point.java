package com.rakovets.course.java.core.practice.oop.classes_and_objects;

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

    public double getDistance(Point point2) {
        double distance = Math.sqrt((x - point2.x) * (x - point2.x) + (y - point2.y) * (y - point2.y));
        return distance;
    }
}
