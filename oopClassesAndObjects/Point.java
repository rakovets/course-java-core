package com.rakovets.course.challenge.oopClassesAndObjects;

public class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return this.x;
    }

    void setX(double x) {
        this.x = x;
    }

    double getY() {
        return this.y;
    }

    void setY(double y) {
        this.y = y;
    }

    double distance(Point externalPoint) {
        return Math.pow((this.x - externalPoint.getX()), 2) + Math.pow((this.y - externalPoint.getY()), 2);
    }
    void display() {
        System.out.printf("Point (%.2f, %.2f)\n", this.x, this.y);
    }
}
