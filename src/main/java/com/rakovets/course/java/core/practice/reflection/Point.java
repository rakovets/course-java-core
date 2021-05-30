package com.rakovets.course.java.core.practice.reflection;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
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
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getDistance(Point point) {
        return BigDecimal.valueOf(Math.sqrt(Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2))).setScale(4, RoundingMode.HALF_UP).doubleValue();
    }
}
