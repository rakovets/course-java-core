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

    public void setFirstPoint(Point point) {
        this.firstPoint = point;
    }

    public Point getSecondPoint() {
        return this.secondPoint;
    }

    public void setSecondPointPoint(Point point) {
        this.secondPoint = point;
    }

    public double getPerimeter() {
        double x1 = this.firstPoint.getX();
        double y1 = this.firstPoint.getY();
        double x2 = this.secondPoint.getX();
        double y2 = this.secondPoint.getY();
        double width = getDistance(x1, x2);
        double length = getDistance(y1, y2);
        return length * 2 + width * 2;
    }

    public double getArea() {
        double x1 = this.firstPoint.getX();
        double y1 = this.firstPoint.getY();
        double x2 = this.secondPoint.getX();
        double y2 = this.secondPoint.getY();
        double width = getDistance(x1, x2);
        double length = getDistance(y1, y2);
        return length * width;

    }

    private double getDistance(double x1, double x2) {
        if (x1 > x2) {
            return x1 - x2;
        } else {
            return x2 - x1;
        }
    }
}
