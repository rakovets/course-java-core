package com.rakovets.course.java.core.practice.oop_classes_and_objects;


public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
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

    public double getDistance(Point point) {
        double distanse = Math.sqrt(
                (Math.pow((point.getX() - this.x), 2)) + Math.pow((point.getY() - this.y), 2));
        return distanse;
    }
}





