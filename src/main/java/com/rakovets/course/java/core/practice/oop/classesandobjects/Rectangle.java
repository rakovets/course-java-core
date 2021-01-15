package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Rectangle {
    private Point firstPoint;
    private Point secondPoint;

    Rectangle(Point firstPoint, Point secondPoint) {
    this.firstPoint = firstPoint;
    this.secondPoint = secondPoint;
    }

    public Point getFirstPoint() {
    return this.firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
    this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return this.secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public int getPerimeter() {
        int oneSideOfRectangle = Math.abs(firstPoint.getX() - secondPoint.getX());
        int secondSideOfRectangle = Math.abs(firstPoint.getY() - secondPoint.getY());
        int perimeter = 2 * (oneSideOfRectangle + secondSideOfRectangle);
        return perimeter;
    }

    public int getArea() {
        int oneSideOfRectangle = Math.abs(firstPoint.getX() - secondPoint.getX());
        int secondSideOfRectangle = Math.abs(firstPoint.getY() - secondPoint.getY());
        int area = oneSideOfRectangle * secondSideOfRectangle;
        return area;
    }
}
