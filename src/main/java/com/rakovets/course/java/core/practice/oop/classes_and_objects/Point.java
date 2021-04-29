package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Point {
    private int X;
    private int Y;

    public Point (int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void setX(int X) {
        this.X = X;
    }

    public void setY(int pointY) {
        this.Y = Y;
    }

    public double getDistance(Point point) {
        return Math.sqrt(Math.pow(X - point.X, 2) + Math.pow(Y - point.Y, 2));
    }
}
