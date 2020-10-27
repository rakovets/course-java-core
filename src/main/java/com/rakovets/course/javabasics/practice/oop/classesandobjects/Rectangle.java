package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {
    public int firstPoint;
    public int secondPoint;


    public Rectangle (int firstPoint, int secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public int getFirstPoint() {
         return firstPoint;
    }

    public  void setFirstPoint(int i) {
      this.secondPoint = secondPoint;
    }

    public int getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(int i) {
        this.secondPoint = secondPoint;
    }

////    public int getPerimeter() { // два метода
//        Point firstpoint = new Point(firstPoint.getX(), secondPoint.getY());
//        double length = Math.sqrt
////      return ...;
////    }
//
//    public int getArea() {
//
//    }

}