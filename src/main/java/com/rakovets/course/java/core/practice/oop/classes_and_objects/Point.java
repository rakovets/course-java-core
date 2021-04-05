package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Point {

    private int x;
    private int y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistance(Point point) {
        return Math.sqrt ((point.x - this.x)^2 + (point.y-this.y)^2);
    }
    }

