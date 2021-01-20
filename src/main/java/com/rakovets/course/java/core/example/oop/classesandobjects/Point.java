package com.rakovets.course.java.core.example.oop.classesandobjects;


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
    public double distance(Point B) {
        return Math.sqrt((Math.pow((B.getX() - this.x), 2) + (Math.pow((B.getY() - this.y), 2))));
    }
}
