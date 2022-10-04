package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public double getPerimeter() {
        double perimeter = (Math.abs(topLeftPoint.getX() - bottomRightPoint.getX()) +
                Math.abs(topLeftPoint.getY() - bottomRightPoint.getY())) * 2;
        return perimeter;
    }

    public double getArea() {
        double area = Math.abs(topLeftPoint.getX() - bottomRightPoint.getX()) *
                Math.abs(topLeftPoint.getY() - bottomRightPoint.getY());
        return  area;
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
}
