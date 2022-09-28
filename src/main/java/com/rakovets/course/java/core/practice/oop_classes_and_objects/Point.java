package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Point {
    private final int SQUARING = 2;

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

    public double getDistance(Point point) {
        return Math.sqrt(Math.pow((this.x - point.getX()), SQUARING) + Math.pow((this.y - point.getY()), SQUARING));
    }
}
