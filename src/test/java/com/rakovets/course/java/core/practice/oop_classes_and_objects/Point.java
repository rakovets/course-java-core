package com.rakovets.course.java.core.practice.oop_classes_and_objects;

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

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDistance(Point point) {
        return getRadicalOfNumber(Utils.getSquareOfNumber(this.x - point.x) + Utils.getSquareOfNumber(this.y - point.y));
    }

    private int getRadicalOfNumber(int number) {
        return (int) Math.sqrt(number);
    }
}
