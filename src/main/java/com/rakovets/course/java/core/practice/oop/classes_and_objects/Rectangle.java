package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Rectangle {
    private Point firstPoint;
    private Point secondPoint;

    public Rectangle(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public double getPerimeter() {
        return 2 * (Math.abs(secondPoint.getX() - firstPoint.getX()) + Math.abs(secondPoint.getY() - firstPoint.getY()));
    }
    
    public double getArea() {
        return Math.abs((secondPoint.getX() - firstPoint.getX()) * (secondPoint.getY() - firstPoint.getY()));
    }
}
