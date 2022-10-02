package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    public static void main(String[] args) {

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
    public  Point getBottomRightPoint() {
        return bottomRightPoint;
    }
    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }
    public  void  setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }
    public int getPerimeter(Point topLeftPoint, Point bottomRightPoint) {
        int perimeter = (Math.abs(this.bottomRightPoint.getX() - this.topLeftPoint.getX()) +
                Math.abs(this.bottomRightPoint.getY() - this.topLeftPoint.getY())) * 2;
        return perimeter;
    }
    public int getArea(Point topLeftPoint, Point bottomRightPoint) {
        int area = Math.abs((this.bottomRightPoint.getX() - this.topLeftPoint.getX()) *
                (this.bottomRightPoint.getY() - this.topLeftPoint.getY()));
        return area;
    }
}
