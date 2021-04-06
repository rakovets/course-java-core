package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Rectangle {
    private Points firstPoint;
    private Points secondPoint;

    public Rectangle(Points firstPoint,Points secondPoint) {
        this.firstPoint=firstPoint;
        this.secondPoint=secondPoint;
    }

    public Points getFirstPoint() {
        return  firstPoint;
    }
    public void setFirstPoint(Points firstPoint) {
       this.firstPoint=firstPoint;
    }
    public Points getSecondPoint() {
        return  secondPoint;
    }
    public void setSecondPoint(Points secondPoint) {
        this.secondPoint = secondPoint;
    }
    public double getPerimeter() {
        return 2 * (Math.abs(firstPoint.getX() - secondPoint.getX()) + Math.abs(firstPoint.getY() - secondPoint.getY()));
    }
    public double getArea() {
        return Math.abs(firstPoint.getX() - secondPoint.getX()) * Math.abs(firstPoint.getY() - secondPoint.getY());
    }
}
