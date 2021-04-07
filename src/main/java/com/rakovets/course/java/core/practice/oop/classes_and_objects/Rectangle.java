package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Rectangle {

    Point firstPoint;
    Point secondPoint;

    public Rectangle(Point firstPoint, Point secondPoint){
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }
    public Point getSecondPoint() {
        return secondPoint;
    }
    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }
    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public int gerPerimeter (Rectangle rectangle){
        return (this.secondPoint.getX() - this.firstPoint.getX())*2 + (this.secondPoint.getY() - this.firstPoint.getY()) *2;
    }

    public  int getArea (Rectangle rectangle) {
        return (this.secondPoint.getX() - this.firstPoint.getX()) * (this.secondPoint.getY() - this.firstPoint.getY());
    }
}
