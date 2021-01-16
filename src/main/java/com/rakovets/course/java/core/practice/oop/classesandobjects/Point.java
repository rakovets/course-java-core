package com.rakovets.course.java.core.practice.oop.classesandobjects;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double getDistance(Point p) {
        return sqrt(pow(p.x - this.x, 2) + pow(p.y - this.y, 2));
    }
}
