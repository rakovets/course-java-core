package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    Point topLeftPoint;
    Point bottomRightPoint;

    Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public String getTopLeftPoint() {
        return "x = " + topLeftPoint.getX() + " " + "y = " + topLeftPoint.getY();
    }

    public String getBottomRightPoint() {
        return "x = " + bottomRightPoint.getX() + " " + "y = " + bottomRightPoint.getY();
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }

    public int getPerimeter() {
        return ((bottomRightPoint.getX() - topLeftPoint.getX()) + (topLeftPoint.getY() - bottomRightPoint.getY())) * 2;
    }

    public int getArea() {
        return (bottomRightPoint.getX() - topLeftPoint.getX()) * (topLeftPoint.getY() - bottomRightPoint.getY());
    }
}
