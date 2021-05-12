package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Rectangle {
   private Point firstPoint;
   private Point secondPoint;

    public Rectangle(Point firstPoint, Point secondPoint) {
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

    public int gerPerimeter (Rectangle rectangle) {
        return Math.abs(this.secondPoint.getX() - this.firstPoint.getX())*2 + Math.abs(this.secondPoint.getY() - this.firstPoint.getY()) * 2;
    }

    public  int getArea (Rectangle rectangle) {
        return Math.abs(this.secondPoint.getX() - this.firstPoint.getX()) * Math.abs(this.secondPoint.getY() - this.firstPoint.getY());
    }
}
