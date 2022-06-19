package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public Point getTopLeftPoint() {
        return  this.topLeftPoint;
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

    public int getPerimeter() {
        int length = Math.abs(bottomRightPoint.getX() - topLeftPoint.getX());
        int width = Math.abs(topLeftPoint.getY() - bottomRightPoint.getY());
        return (length + width) * 2;
    }

    public int getArea() {
        int length = Math.abs(bottomRightPoint.getX() - topLeftPoint.getX());
        int width = Math.abs(topLeftPoint.getY() - bottomRightPoint.getY());
        return length * width;
    }
}
