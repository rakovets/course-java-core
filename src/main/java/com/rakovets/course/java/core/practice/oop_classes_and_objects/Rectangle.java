package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
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

    public int getPerimeter() {
        return getLengthSideX() + getLengthSideX() + getLengthSideY() + getLengthSideY();
    }

    public int getArea() {
        return getLengthSideX() * getLengthSideY();
    }

    private int getLengthSideX() {
        int xTopLeftPoint = topLeftPoint.getX();
        int xBottomRightPoint = bottomRightPoint.getX();
        int lengthSideX;
        if (xTopLeftPoint < 0 && xBottomRightPoint < 0) {
            lengthSideX = Math.abs(xTopLeftPoint - xBottomRightPoint);
        } else if (xTopLeftPoint < 0) {
            lengthSideX = Math.abs(xTopLeftPoint) + xBottomRightPoint;
        } else {
            lengthSideX = xBottomRightPoint - xTopLeftPoint;
        }
        return lengthSideX;
    }

    private int getLengthSideY() {
        int yTopLeftPoint = topLeftPoint.getY();
        int yBottomRightPont = bottomRightPoint.getY();
        int lengthSideY;
        if (yTopLeftPoint < 0 && yBottomRightPont < 0) {
            lengthSideY = Math.abs(yBottomRightPont - yTopLeftPoint);
        } else if (yBottomRightPont < 0) {
            lengthSideY = yTopLeftPoint + Math.abs(yBottomRightPont);
        } else {
            lengthSideY = yTopLeftPoint - yBottomRightPont;
        }
        return lengthSideY;
    }
}
