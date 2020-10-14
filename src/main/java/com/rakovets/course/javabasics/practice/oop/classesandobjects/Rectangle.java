package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {
    private int topLeftPoint;
    private int bottomRightPoint;

    Rectangle(int first, int second){
        this.topLeftPoint = first;
        this.bottomRightPoint = second;
      }

    Rectangle(Point first, Point second) {
            }

    public void setFirstPoint(int first) {
        this.topLeftPoint = first;

    }

    public void setSecondPoint(int second) {
        this.bottomRightPoint = second;

    }

    public int getFirstPoint() {
        return this.topLeftPoint;
    }

    public int getSecondPoints() {
        return this.bottomRightPoint;
    }

 //   public int getPerimeter(Rectangle first, Rectangle second) {
   // }




    public int getArea(int a, int a1, int b, int b1) {
        int aA = (a - a1);
        int bB = (b - b1);
        int S = aA * bB;
        if (S < 0)
            S *= -1;
        return S;
    }
}
