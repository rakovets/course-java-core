package com.rakovets.course.java.core.practice.oop.classesandobjects;
import java.awt.geom.Point2D;

public class Point {
    private double x;
    private double y;

    Point() {
    }

    Point(double x, double y) {
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
        return  y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point pointIn2D) {
        return Point2D.distance(x, y, pointIn2D.x, pointIn2D.y);
    }
}
