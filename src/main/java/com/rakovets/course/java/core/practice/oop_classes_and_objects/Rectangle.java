package com.rakovets.course.java.core.practice.oop_classes_and_objects;


public class Rectangle {
    Point topLeftPoint;
    Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public int getPerimeter(Point topLeftPoint, Point bottomRightPoint) {
        int perimetr = 0;
        int length = Math.abs(topLeftPoint.y - bottomRightPoint.y);
        int width = Math.abs(bottomRightPoint.x - topLeftPoint.x);
        perimetr = 2 * (length + width);
        return perimetr;
    }

    public int getArea(Point topLeftPoint, Point bottomRightPoint) {
        int area = 0;
        int length = Math.abs(topLeftPoint.y - bottomRightPoint.y);
        int width = Math.abs(bottomRightPoint.x - topLeftPoint.x);
        area = length * width;
        return area;
    }

    public void getTopLeftPoint() {
        this.topLeftPoint.x = topLeftPoint.getX();
        this.topLeftPoint.y = topLeftPoint.getY();
    }

    public void setTopLeftPoint(int x, int y) {
        this.topLeftPoint.x = x;
        this.topLeftPoint.y = y;
    }

    public void getBottomRightPoint() {
        this.bottomRightPoint.x = bottomRightPoint.getX();
        this.bottomRightPoint.y = bottomRightPoint.getY();
    }

    public void setBottomRightPoint(int x, int y) {
        this.bottomRightPoint.x = x;
        this.bottomRightPoint.y = y;
    }
}
