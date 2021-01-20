package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Point {
    private double x;
    private double y;

    Point(double x, double y) {
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

    public double distance(Point point) {
        double x1 = this.x;
        double y1 = this.y;
        double x2 = point.getX();
        double y2 = point.getY();
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
}
