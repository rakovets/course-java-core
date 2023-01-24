package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private double xLength;
    private double yLength;
    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
        initLengthSide();
    }

    private void initLengthSide() {
        xLength = Math.abs(topLeftPoint.getX() - bottomRightPoint.getX());
        yLength = Math.abs(topLeftPoint.getY() - bottomRightPoint.getY());
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

    public double getPerimeter() {
        return Utils.getSquareOfNumber(xLength) + Utils.getSquareOfNumber(yLength);
    }

    public double getArea() {
        return xLength * yLength;
    }
}
