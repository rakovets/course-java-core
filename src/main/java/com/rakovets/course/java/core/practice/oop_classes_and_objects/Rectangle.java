package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public int getPerimeter() {
        return ((bottomRightPoint.getX() - topLeftPoint.getX()) + (topLeftPoint.getY() - bottomRightPoint.getY())) * 2;
    }

    public int getArea() {
        return (bottomRightPoint.getX() - topLeftPoint.getX()) * (topLeftPoint.getY() - bottomRightPoint.getY());
    }

    public String getTopLeftPoint() {
        return "x = " + topLeftPoint.getX() + " " + "y = " + topLeftPoint.getY();
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public String getBottomRightPoint() {
        return "x = " + bottomRightPoint.getX() + " " + "y = " + bottomRightPoint.getY();
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }
}
