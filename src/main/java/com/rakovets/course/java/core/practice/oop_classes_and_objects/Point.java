package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.util.NumberUtil;

public class Point {
    private int x;
    private int y;

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double getDistance(Point targetPoint) {
        double distance = Math.sqrt(Math.pow((targetPoint.y - this.y), 2) + Math.pow((targetPoint.x - this.x), 2));
        return NumberUtil.roundValueToTwoDigitsForMantissa(distance);
    }
}
