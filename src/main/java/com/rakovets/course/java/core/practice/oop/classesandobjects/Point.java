package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
    this.x = x;
    this.y = y;
    }

    public int getX() {
    return this.x;
    }

    public void setX(int x) {
    this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int distance(Point newPoint) {
        double distance;
        distance = Math.sqrt((newPoint.x - this.x) * (newPoint.x - this.x) + (newPoint.y - this.y) * (newPoint.y - this.y));
        return (int) distance;
    }
}
