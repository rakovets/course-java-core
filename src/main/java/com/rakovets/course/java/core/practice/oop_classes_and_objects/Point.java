package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.util.NumberUtil;

public class Point {
    private double x;
    private double y;

    {
        this.x = 0;
        this.y = 0;
    }

    Point() {
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
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

    public double getDistance(Point secondPoint) {
        double distance = Math.sqrt(Math.pow(secondPoint.getX() - this.getX(), 2) + Math.pow(secondPoint.getY() - this.getY(), 2));
        return NumberUtil.roundValueToTwoDigitsForMantissa(distance);
    }
}
