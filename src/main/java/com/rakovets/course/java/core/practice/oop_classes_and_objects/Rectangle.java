package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private double  topLeftPoint;
    private double bottomRightPoint;
    public Rectangle(double topLeftPoint, double bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }
    public double getTopLeftPoint(double topLeftPoint) {
        return topLeftPoint;
    }
    public void setTopLeftPoint(double topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }
    public double getBottomRightPoint(double bottomRightPoint) {
        return bottomRightPoint;
    }
    public void setBottomRightPoint(double bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }
    public double getPerimeter(Point topLeftPoint, Point bottomRightPoint) {
        double x = bottomRightPoint.getX() - topLeftPoint.getX();
        double y = topLeftPoint.getY() - bottomRightPoint.getY();
        return 2 * (x + y);
    }
    public double getArea(Point topLeftPoint, Point bottomRightPoint) {
        double x = bottomRightPoint.getX() - topLeftPoint.getX();
        double y = topLeftPoint.getY() - bottomRightPoint.getY();
        return x * y;
    }
}
