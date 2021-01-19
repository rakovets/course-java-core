package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Rectangle {
    private Point firstPoint;
    private Point secondPoint;

    Rectangle(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
   }

   public Point getFirstPoint() {
        return this.firstPoint;
   }
   public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
   }
   public Point getSecondPoint() {
        return this.secondPoint;
   }
   public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
   }
   public double getPerimeter() {
        return (Math.abs(secondPoint.getX() - firstPoint.getX()) * 2 + Math.abs(secondPoint.getY() - firstPoint.getY()) * 2);
   }
   public double getArea() {
       return Math.abs((secondPoint.getX() - firstPoint.getX()) * (secondPoint.getY() - firstPoint.getY()));
   }
}
