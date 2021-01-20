package com.rakovets.course.java.core.practice.oop.classesandobjects;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
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
    public double getDistance(Point b) {

        //formula for finding the distance from point А to point B in space

        return sqrt(pow(b.x - this.x, 2) + pow(b.y - this.y, 2));
    }
}
