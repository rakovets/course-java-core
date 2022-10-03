package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point  topLeftPoint = 0;
    private Point bottomRightPoint = 0;
    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }
    public double getTopLeftPoint() {
        return topLeftPoint;
    }
    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }
    public double getBottomRightPoint() {
        return bottomRightPoint;
    }
    public void setBottomRightPoint(Point bottomRightPoint) {
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
