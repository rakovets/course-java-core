package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public Point getTopLeftPoint() {
        return this.topLeftPoint;
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

    public int getPerimeter(Point topLeftPoint, Point bottomRightPoint) {
        int lengthSideX = getLengthSideX(topLeftPoint.getX(), bottomRightPoint.getX());
        int LengthSideY = getLengthSideY(topLeftPoint.getY(), bottomRightPoint.getY());
        return (int) (squareNumber(lengthSideX) + squareNumber(LengthSideY));
    }

    private int getLengthSideX(int xTopLeftPoint, int xBottomRightPoint) {
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

    private int getLengthSideY(int yTopLeftPoint, int yBottomRightPont) {
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

    private double squareNumber(int number) {
        return Math.pow(number, 2);
    }


}
