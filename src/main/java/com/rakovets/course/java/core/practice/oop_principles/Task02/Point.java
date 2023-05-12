package com.rakovets.course.java.core.practice.oop_principles.Task02;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(Point pt) {
        return Math.hypot(this.x - pt.x, this.y - pt.y);
    }

    double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
