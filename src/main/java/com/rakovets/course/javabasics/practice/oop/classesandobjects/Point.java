package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Point {
    private int x;
    private int y;
    private int point;

    Point(int x, int y) {
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

    public int distance(Point point) {
    double distance = Math.sqrt((x - point.getX() * (x - point.getX()) + (y - point.getY()  * (y - point.getY()))));
    return (int) distance;
    }

}
