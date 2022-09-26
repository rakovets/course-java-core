package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public Point getBottomRightPoint() {
        return bottomRightPoint;
    }

    public int getPerimeter() {
        return Math.abs(topLeftPoint.getX() - bottomRightPoint.getX()) * 2
                + Math.abs(topLeftPoint.getY() - bottomRightPoint.getY()) * 2;
    }

    public int getArea() {
        return Math.abs(topLeftPoint.getX() - bottomRightPoint.getX())
                * Math.abs(topLeftPoint.getY() - bottomRightPoint.getY());
    }
}
