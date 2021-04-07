package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Rectangle {
    private int firstPoint;
    private int secondPoint;

    Rectangle (int firstPoint, int secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public int getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(int firstPoint) {
        this.firstPoint = firstPoint;
    }

    public int getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(int secondPoint) {
        this.secondPoint = secondPoint;
    }

    public double getPerimeter() {
        return firstPoint * 2 + secondPoint * 2;
    }

    public double getArea() {
        return firstPoint * secondPoint;
    }
}
