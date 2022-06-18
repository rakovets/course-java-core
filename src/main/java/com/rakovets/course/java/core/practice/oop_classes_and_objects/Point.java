package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistance(Point nextPoint) {
        double squareOfDifferenceX = Math.pow(this.x - nextPoint.getX(), 2);
        double squareOfDifferenceY = Math.pow(this.y - nextPoint.getY(), 2);
        return Math.sqrt(squareOfDifferenceX + squareOfDifferenceY);
    }
}
