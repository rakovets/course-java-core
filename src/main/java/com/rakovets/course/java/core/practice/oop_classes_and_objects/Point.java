package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Point {

    double x;
    double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point point) {
        return Math.sqrt(Math.pow((point.x - this.x), 2) + Math.pow((point.y - this.y), 2));
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
