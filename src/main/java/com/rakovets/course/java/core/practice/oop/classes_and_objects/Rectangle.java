package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Rectangle {
    private double firstPoint;
    private double secondPoint;

    public Rectangle(double firstPoint, double secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }
    public double getFirstPoint() {
        return firstPoint;
    }
    public void setFirstPoint(double firstPoint) {
        this.firstPoint = firstPoint;
    }
    public double getSecondPoint() {
        return secondPoint;
    }
    public void setSecondPoint(double secondPoint) {
        this.secondPoint = secondPoint;
    }
    public double getPerimeter() {
        return firstPoint * 2 + secondPoint * 2;
    }
    public double getArea() {
        return  firstPoint * secondPoint;
    }
}
