package com.rakovets.course.java.core.practice.oop_principles;

public class Point {

    public int x;
    public int y;

    public Point(int x1, int x2) {
        this.x = x1;
        this.y = x2;
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

    public double getDistance() {
        return Math.sqrt(x * x + y * y);
    }
}

