package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public double getPerimeter() {
        double firstSide = Math.abs(bottomRightPoint.getX() - topLeftPoint.getX());
        double secondSide = Math.abs(bottomRightPoint.getY() - topLeftPoint.getY());
        return 2 * (firstSide + secondSide);
    }

    public double getArea() {
        double firstSide = Math.abs(bottomRightPoint.getX() - topLeftPoint.getX());
        double secondSide = Math.abs(bottomRightPoint.getY() - topLeftPoint.getY());
        return firstSide * secondSide;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public Point getBottomRightPoint() {
        return bottomRightPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }
}
