package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getDistance(Point point) {
        return (int) Math.sqrt((this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y));
    }

    public int get_X() {

        return x;
    }
    public void set_X(int x) {

        this.x = x;
    }

    public int get_Y() {

        return y;
    }

    public void set_Y(int y) {

        this.y = y;
    }
}
