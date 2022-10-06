package com.rakovets.course.java.core.practice.oop_classes_and_objects;


public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public Point getTopLeftPoint() {
        return this.topLeftPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public Point getBottomRightPoint() {
        return this.bottomRightPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }

    public int getWidth() {
        return this.bottomRightPoint.getX() - this.topLeftPoint.getX();
    }

    public int getHeight() {
        return this.topLeftPoint.getY() - this.bottomRightPoint.getY();
    }

    public int getPerimeter() {
        return (getWidth() + getHeight()) * 2;
    }

    public int getArea() {
        return getWidth() * getHeight();
    }
}
