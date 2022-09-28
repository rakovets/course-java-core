package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;
    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
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
        return ((this.bottomRightPoint.getX() - this.topLeftPoint.getX()) + (this.topLeftPoint.getY() - this.bottomRightPoint.getY())) * 2;
    }
    public double getArea() {
        return (this.bottomRightPoint.getX() - this.topLeftPoint.getX()) * (this.topLeftPoint.getY() - this.bottomRightPoint.getY());
    }
}

