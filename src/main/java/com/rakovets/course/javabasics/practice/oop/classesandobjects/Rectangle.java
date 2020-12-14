package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {
    Point topLeftPoint;
    Point bottomRightPoint;

    Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    private Point getTopLeftPoint() {
        return this.topLeftPoint;
    }
    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }
    private Point getBottomRightPoint() {
        return this.bottomRightPoint;
    }
    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }
    public double getPerimeter() {
        Point topRightPoint = new Point(bottomRightPoint.x, topLeftPoint.y);
        double perimeter = (Math.abs(topLeftPoint.y - bottomRightPoint.y) + Math.abs(topRightPoint.x - topLeftPoint.x)) * 2;
        return perimeter;
    }
    public double getArea() {
        Point topRightPoint = new Point(bottomRightPoint.x, topLeftPoint.y);
        double area = Math.abs(topLeftPoint.y - bottomRightPoint.y) * Math.abs(topRightPoint.x - topLeftPoint.x);
        return area;
    }
}
