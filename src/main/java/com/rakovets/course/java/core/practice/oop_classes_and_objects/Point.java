package com.rakovets.course.java.core.practice.oop_classes_and_objects;


import com.rakovets.course.java.core.util.NumberUtil;
public class Point {
    private int x;
    private int y;
    public Point(int x1, int y1) {
        this.setX(x1);
        this.setY(y1);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x1) {
        this.x = x1;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y1) {
        this.y = y1;
    }
    public double getDistance(Point distance) {
        double move = Math.sqrt((this.getX() - distance.getX()) * (this.getX() - distance.getX()) + (this.getY() - distance.getY()) * (this.getY() - distance.getY()));
        return NumberUtil.roundValueToTwoDigitsForMantissa(move);
    }
}
