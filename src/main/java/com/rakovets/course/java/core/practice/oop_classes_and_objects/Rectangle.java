package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.util.NumberUtil;

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

    public Point setTopLeftPoint (Point topLeftPoint) {
        return topLeftPoint;
    }

    public Point getBottomRightPoint () {
        return this.bottomRightPoint;
    }

    public Point setBottomRightPoint (Point bottomRightPoint) {
        return bottomRightPoint;
    }

    public double getPerimeter () {
        double high = Math.abs(topLeftPoint.getY() - bottomRightPoint.getY());
        double length = Math.abs(bottomRightPoint.getX() - topLeftPoint.getX());
        double perimeter = (length * high) * 2;
        return NumberUtil.roundValueToTwoDigitsForMantissa(perimeter);
    }

    public double getArea () {
        double length = Math.abs(bottomRightPoint.getX() - topLeftPoint.getX());
        double high = Math.abs(topLeftPoint.getY() - bottomRightPoint.getY());
        double area = length * high;
        return area;
    }
}
