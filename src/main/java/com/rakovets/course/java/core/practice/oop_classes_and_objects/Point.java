package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.util.NumberUtil;

public class Point {
    public int x;
    public int y;

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point point) {
        int xNew = this.x - point.x;
        int yNew = this.y - point.y;
        return NumberUtil.roundValueToTwoDigitsForMantissa(Math.pow((Math.pow(xNew, 2) + Math.pow(yNew, 2)), 0.5));
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
}
