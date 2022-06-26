package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle (Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public Point getTopLeftPoint() {
        return this.topLeftPoint;
    }

    public void setTopLeftPoint() {
        this.topLeftPoint = topLeftPoint;
    }

    public Point getBottomRightPoint() {
        return this.bottomRightPoint;
    }

    public void setBottomRightPoint() {
        this.bottomRightPoint = bottomRightPoint;
    }

    public double getDistance() {
        double distancePointX = Math.abs(bottomRightPoint.getPointX() - topLeftPoint.getPointX());
        double distancePointY = Math.abs(bottomRightPoint.getPointY() - topLeftPoint.getPointY());
        return (distancePointX + distancePointY) * 2;
    }

    public double getArea() {
        double distancePointX = Math.abs(bottomRightPoint.getPointX() - topLeftPoint.getPointX());
        double distancePointY = Math.abs(bottomRightPoint.getPointY() - topLeftPoint.getPointY());
        return distancePointX * distancePointY;
    }
}
