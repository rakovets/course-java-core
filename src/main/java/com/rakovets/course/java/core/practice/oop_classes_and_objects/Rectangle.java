package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public Point getTopLeftPoint() {
        return this.topLeftPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public Point getBottomRightPoint() {
        return this.bottomRightPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }

    public double getPerimeter() {
        double a = bottomRightPoint.getX() - topLeftPoint.getX();
        double b = topLeftPoint.getY() - bottomRightPoint.getY();
        return 2 * (a + b);
    }

    public double getArea() {
        double a = bottomRightPoint.getX() - topLeftPoint.getX();
        double b = topLeftPoint.getY() - bottomRightPoint.getY();
        return a * b;
    }
}
