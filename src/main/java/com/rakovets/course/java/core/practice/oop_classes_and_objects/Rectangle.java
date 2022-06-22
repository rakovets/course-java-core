package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {

    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public double getPerimeter() {
        return (2 * ((topLeftPoint.getY() - bottomRightPoint.getY()) + (bottomRightPoint.getX() - topLeftPoint.getX())));
    }

    public double getArea() {
        return (topLeftPoint.getY() - bottomRightPoint.getY()) * (bottomRightPoint.getX() - topLeftPoint.getX());
    }

    public Point getTopLeftPoint() {
        return this.topLeftPoint;
    }

    public Point getBottomRightPoint() {
        return this.bottomRightPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }
}
