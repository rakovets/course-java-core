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
    public double getSecondPoint() {
        return secondPoint;
    }
    public void setFirstPoint(double firstPoint) {
        this.firstPoint = firstPoint;
    }
    public void setSecondPoint(double secondPoint) {
        this.secondPoint = secondPoint;
    }
    public double getPerimeter() {
        double perimeter = firstPoint * 2 + secondPoint * 2;
        return perimeter;
    }
    public double getArea() {
        double area = firstPoint * secondPoint;
        return area;
    }
}
