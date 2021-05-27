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

    public int getPerimeter() {
        return (Math.abs(secondPoint.getxPoint() - firstPoint.getxPoint()) + Math.abs(secondPoint.getyPoint() - firstPoint.getyPoint())) * 2;
    }

    public int getArea() {
        return (Math.abs(secondPoint.getxPoint() - firstPoint.getxPoint()) * Math.abs(secondPoint.getyPoint() - firstPoint.getyPoint()));
    }
}
