package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {
    private int firstPoint;
    private int secondPoint;


    public Rectangle (int firstPoint, int secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public int getFirstPoint() {
         return firstPoint;
    }

    public  void setFirstPoint(int firstPoint) {
      this.firstPoint = firstPoint;
    }

    public int getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(int secondPoint) {
        this.secondPoint = secondPoint;
    }

//    public int getPerimeter() { // два метода
//        Point firstpoint = new Point(firstPoint.getX(), secondPoint.getY());
//        double length = Math.sqrt((secondPoint.getY() - firstPoint.getY() * (secondPoint.getY() - firstPoint.getY()) + (secondPoint.getX() - firstPoint.getX()) *(secondPoint.getX() - firstPoint.getX())));
//        double width = Math.sqrt((firstpoint.getY() - secondPoint.getY()) * (firstpoint.getY() - secondPoint.getY()) + firstpoint.getX() - secondPoint.getX()) * (firstpoint.getX() - secondPoint.getX());
//        double perimeter = length * width / 2;
//      return (int) perimeter;
//    }
//
//    public int getArea() {
//
//    }

}