package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Point {
    public static void main(String[] args) {

    }
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return  y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double getDistance(Point point) {
        double distance = Math.sqrt(Math.pow((this.x - point.getX()), 2) + Math.pow(this.y - point.getY(), 2));
        return  Math.round(distance * 100.0) / 100.0;
    }
}
