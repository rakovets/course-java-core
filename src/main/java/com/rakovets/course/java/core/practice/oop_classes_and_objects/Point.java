package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Point {
    private double x;
    private double y;

    /**
     * Constructor. Accepts `x` and `y` coordinates.
     *
     * @param x point coordinate along the Ox axis.
     * @param y point coordinate along the Oy axis.
     */
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

    /**
     * Accepts an object of type `Point`.
     * Returns the distance from the current point (the instance on which it was called) to the received point.
     */
    public double getDistance(Point instancePoint) {
        return Math.sqrt((this.x - instancePoint.x) * (this.x - instancePoint.x) + (this.y - instancePoint.y) * (this.y - instancePoint.y));
    }
}
