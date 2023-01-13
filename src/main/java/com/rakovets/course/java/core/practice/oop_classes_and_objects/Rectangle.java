package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private int xLength;
    private int yLength;
    Point topLeftPoint;
    Point bottomRightPoint;

    Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
        initLengthSide();
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
        return Utils.getSquareOfNumber(xLength) + Utils.getSquareOfNumber(yLength);
    }

    public int getArea() {
        return xLength * yLength;
    }

    private void initLengthSide() {
        xLength = Math.abs(topLeftPoint.getX() - bottomRightPoint.getX());
        yLength = Math.abs(topLeftPoint.getY() - bottomRightPoint.getY());
    }
}
