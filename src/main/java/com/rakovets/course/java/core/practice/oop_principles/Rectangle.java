package com.rakovets.course.java.core.practice.oop_principles;

public class Rectangle {

    public Rectangle(com.rakovets.course.java.core.practice.oop_principles.Point topLeftPoint1, com.rakovets.course.java.core.practice.oop_principles.Point bottomRightPoint1) {
    }

    public static class Point {
        public int x;
        public int y;
        public int x1;
        public int y1;

        public void Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    Point topLeftPoint;
    Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint() {
        this.topLeftPoint = topLeftPoint;
    }

    public Point getBottomRightPoint() {
        return bottomRightPoint;
    }

    public void setBottomRightPoint() {
        this.bottomRightPoint = bottomRightPoint;
    }

    public int getPerimeter(Point topLeftPoint, Point bottomRightPoint) {
        int perimetr = 0;
        perimetr = (bottomRightPoint.x1 - topLeftPoint.x + topLeftPoint.y - bottomRightPoint.y1) * 2;
        return perimetr;
    }

    public int getArea(Point topLeftPoint, Point bottomRightPoint) {
        int area = 0;
        area = (bottomRightPoint.x1 - topLeftPoint.x) * (topLeftPoint.y - bottomRightPoint.y1);
        return area;
    }
}

