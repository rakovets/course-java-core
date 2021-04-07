package com.rakovets.course.java.core.practice.oop.classes_and_objects;
import static java.lang.Math.*;

public class Point {
    private int x;
    private int y;

    Point (int x, int y) {
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

    public double getDistance (Point point) {
        return sqrt(pow((x - point.x), 2) + pow((y - point.y), 2));

    }
}
