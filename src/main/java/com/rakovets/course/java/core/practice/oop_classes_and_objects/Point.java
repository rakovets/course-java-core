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

    public  double getDistance(Point point) {
        return squareRootOfNumber(squareNumber(this.x - point.x) + squareNumber(this.y - point.y));
    }

    private double squareRootOfNumber(int number) {
        return Math.sqrt(number);
    }
    private int squareNumber(int number) {
        return (int) Math.pow(number, 2);
    }


}
