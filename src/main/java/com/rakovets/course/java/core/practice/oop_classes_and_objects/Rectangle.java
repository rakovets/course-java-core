package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {

    Point topLeftPoint;
    Point bottomRightPoint;

    public Rectangle (Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public Point getTopLeftPoint() {
        return this.topLeftPoint;
    }

    public void setTopLeftPoint(int x, int y) {
        topLeftPoint = new Point(x, y);
    }

    public Point getBottomRightPoint() {
        return this.bottomRightPoint;
    }

    public void setBottomRightPoint(int x, int y) {
        bottomRightPoint = new Point(x, y);
    }

    public int getPerimeter() {
        return (2 * ((topLeftPoint.getY() - bottomRightPoint.getY()) + (bottomRightPoint.getX() - topLeftPoint.getX())));
    }

    public int getArea() {
        return (topLeftPoint.getY() - bottomRightPoint.getY()) * (bottomRightPoint.getX() - topLeftPoint.getX());
    }
}
