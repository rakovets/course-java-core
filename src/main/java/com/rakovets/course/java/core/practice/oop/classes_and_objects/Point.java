package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Point {
    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getxPoint() {
        return x;
    }

    public int getyPoint() {
        return y;
    }

    public void setxPoint(int x) {
        this.x = x;
    }

    public void setyPoint(int y) {
        this.y = y;
    }

    public int getDistance (Point secondPoint) {
        return (int) Math.sqrt((this.x - secondPoint.x) * (this.x - secondPoint.x)
                + (this.y - secondPoint.y) * (this.y - secondPoint.y));
    }
}
