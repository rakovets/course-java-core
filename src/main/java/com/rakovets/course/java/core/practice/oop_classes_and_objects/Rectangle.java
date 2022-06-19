package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
        this.topLeftPoint = topLeftPoint;
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

    public int getPerimeter() {
        return 2 * (Math.abs(topLeftPoint.getX() - bottomRightPoint.getX()) + Math.abs(topLeftPoint.getY() - bottomRightPoint.getY()));
    }

    public int getArea() {
        return Math.abs((topLeftPoint.getX() - bottomRightPoint.getX()) * (topLeftPoint.getY() - bottomRightPoint.getY()));
    }
}
