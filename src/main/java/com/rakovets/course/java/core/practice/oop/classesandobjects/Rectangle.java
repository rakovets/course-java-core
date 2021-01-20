package com.rakovets.course.java.core.practice.oop.classesandobjects;

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

    public int getPerimetr(Point A,Point B) {
        return (Math.abs(A.getX() - B.getX()) + Math.abs(A.getY() - B.getY())) * 2;
    }
    public int getArea(Point A, Point B) {
        return Math.abs((A.getX() - B.getX()) * (A.getY() - B.getY()));
    }
}
