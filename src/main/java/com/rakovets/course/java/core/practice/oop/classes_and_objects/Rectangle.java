package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Rectangle {
    private Point firstPoint;
    private Point secondPoint;

    Rectangle(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public double getPerimeter() {
        return 2 * (Math.abs(firstPoint.getY() - secondPoint.getY()) + Math.abs(firstPoint.getX() - secondPoint.getX()));
    }

    public double getArea() {
        return Math.abs(firstPoint.getX() - secondPoint.getX() * Math.abs(firstPoint.getY() - secondPoint.getY()));
    }
}
