package com.rakovets.course.java.core.practice.oop_classes_and_objects;

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

    public double getDistance (Point point) {
        return Math.pow(Math.pow((this.getX() - point.x), 2) + Math.pow((this.getY() - point.y), 2), 0.5);
    }
}
