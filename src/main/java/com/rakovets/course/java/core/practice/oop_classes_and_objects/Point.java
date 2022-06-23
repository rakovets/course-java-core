package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Point {
    private double x;
    private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
      return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistance(Point secondPoint) {
        return Math.sqrt(Math.pow(x - secondPoint.getX(), 2) + Math.pow(y - secondPoint.getY(), 2));
    }
}
