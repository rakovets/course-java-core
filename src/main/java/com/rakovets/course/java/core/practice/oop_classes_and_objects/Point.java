package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.util.NumberUtil;

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

    public double getDistance(Point anotherPoint) {
        return NumberUtil.roundValueToTwoDigitsForMantissa(Math.sqrt(Math.pow(x - anotherPoint.getX(), 2) + Math.pow(y - anotherPoint.getY(), 2)));
    }
}
