package com.rakovets.course.java.core.practice.oop_classes_and_objects.task_2;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
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

    public int getDistance (Point point) {
        int xLength = this.x - point.x;
        int yLength = this.y - point.y;
        return (int) Math.sqrt(xLength * xLength + yLength*yLength);
    }
}
