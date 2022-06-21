package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    Point topLeftPoint;
    Point bottomRightPoint;

    public Rectangle (Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }
    public double getPerimeter() {
        return 2 * (Math.abs(topLeftPoint.get_X() - bottomRightPoint.get_X()) + Math.abs(topLeftPoint.get_Y() - bottomRightPoint.get_Y()));
    }

    public double getArea() {
        return Math.abs((topLeftPoint.get_X() - bottomRightPoint.get_X()) * (topLeftPoint.get_Y() - bottomRightPoint.get_Y()));
    }
    public Point getTopLeftPoint(){
        return topLeftPoint;
    }
    public void setTopLeftPoint (Point topLeftPoint){

        this.topLeftPoint = topLeftPoint;
    }
    public Point getBottomRightPoint(){

        return bottomRightPoint;
    }
    public void setBottomRightPoint (Point bottomRightPoint){

        this.bottomRightPoint = bottomRightPoint;
    }
}
