package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Rectangle {
    private Point firstPoint;
    private Point secondPoint;

    public Rectangle(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public String getFirstPoint() {
        return "x=" + firstPoint.getX() + "\ny=" + firstPoint.getY() + "\n" ;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public String getSecondPoint() {
        return "x=" + secondPoint.getX() + "\ny=" + secondPoint.getY() + "\n" ;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public double getPerimeter() {
        double length = secondPoint.getX() - firstPoint.getX();
        double height = secondPoint.getY() - firstPoint.getY();
        double perimeter = 2 * (length + height);
        if (perimeter < 0) {
            perimeter *= -1;
        }
        return perimeter;
    }

    public double getArea() {
        double length = secondPoint.getX() - firstPoint.getX();
        double height = secondPoint.getY() - firstPoint.getY();
        double area = length * height;
        if (area < 0) {
            area *= -1;
        }
        return area;
    }
}
