package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private double topLeftPoint;
    private double bottomRightPoint;

    public Rectangle(double topLeftPoint, double bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public double getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint(double topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public double getBottomRightPoint() {
        return bottomRightPoint;
    }

    public void setBottomRightPoint(double bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }

    public double getPerimeter() {
        final double MULTIPLIER = 2;
        double perimeter = MULTIPLIER * (this.topLeftPoint + this.bottomRightPoint);
        return perimeter;
    }

    public double getArea() {
        double area = this.bottomRightPoint * this.topLeftPoint;
        return area;
    }
}
