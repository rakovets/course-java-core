package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
        this.topLeftPoint = topLeftPoint;
    }

    public double getPerimeter() {
        double perimeter = ((bottomRightPoint.getX() - topLeftPoint.getX()) + (topLeftPoint.getY() - bottomRightPoint.getY())) * 2;
        return perimeter;
    }

    public double getArea() {
        double area = (bottomRightPoint.getX() - topLeftPoint.getX()) * (topLeftPoint.getY() - bottomRightPoint.getY());
        return area;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public Point getBottomRightPoint() {
        return bottomRightPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }
}
