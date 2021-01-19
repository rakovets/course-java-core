package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Point {
    private double x;
    private double y;

    Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return this.y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double distance(Point secondPoint) {
       return Math.sqrt(Math.pow((secondPoint.x - this.x),2) + Math.pow((secondPoint.y - this.y),2));
    }
}
