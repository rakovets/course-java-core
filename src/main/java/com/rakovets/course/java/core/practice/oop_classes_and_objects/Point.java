package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point point) {
        return getRadicalOfNumber(Utils.getSquareOfNumber(this.x - point.x) + Utils.getSquareOfNumber(this.y - point.y));
    }

    private double getRadicalOfNumber(double number) {
        return Math.sqrt(number);
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
}
