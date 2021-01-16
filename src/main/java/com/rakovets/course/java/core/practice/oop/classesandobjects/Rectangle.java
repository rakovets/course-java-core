package com.rakovets.course.java.core.practice.oop.classesandobjects;

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

    public Point getSecondPoint() {
        return secondPoint;
    }
    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public int getPerimeter(Point p1, Point p2) {
        return (Math.abs(p1.getX() - p2.getX()) + Math.abs(p1.getY() - p2.getY())) * 2;
    }

    public int getArea(Point p1, Point p2) {
        return Math.abs((p1.getX() - p2.getX()) * (p1.getY() - p2.getY()));
    }
}

