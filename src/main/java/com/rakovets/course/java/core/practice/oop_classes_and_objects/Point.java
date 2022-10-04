package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.util.NumberUtil;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point point) {
        double distance = NumberUtil.roundValueToTwoDigitsForMantissa(Math.sqrt(Math.pow(x - point.getX(), 2)
                + Math.pow(y - point.getY(), 2)));
        return distance;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
