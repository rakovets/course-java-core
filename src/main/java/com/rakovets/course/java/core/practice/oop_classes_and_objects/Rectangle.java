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
        Point p = new Point(0, 0);
        p.setX(x);
        p.setY(y);
        topLeftPoint = p;
    }

    public Point getBottomRightPoint() {
        return this.bottomRightPoint;
    }

    public void setBottomRightPoint(int x, int y) {
        Point p = new Point(0, 0);
        p.setX(x);
        p.setY(y);
        bottomRightPoint = p;
    }

    public int getPerimeter() {
        int perimeter = (2 * ((topLeftPoint.getY() - bottomRightPoint.getY()) + (bottomRightPoint.getX() - topLeftPoint.getX())));
        return perimeter;
    }

    public int getArea() {
        int area = (topLeftPoint.getY() - bottomRightPoint.getY()) * (bottomRightPoint.getX() - topLeftPoint.getX());
        return area;
    }
}
