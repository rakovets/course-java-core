package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public int getPerimeter() {
        return 2 * ((bottomRightPoint.getX() - topLeftPoint.getX()) + (topLeftPoint.getY() - bottomRightPoint.getY()));
    }

    public int getArea() {
        return (bottomRightPoint.getX() - topLeftPoint.getX()) * (topLeftPoint.getY() - bottomRightPoint.getY());
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

