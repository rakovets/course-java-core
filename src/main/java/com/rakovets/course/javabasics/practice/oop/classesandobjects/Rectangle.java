package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {
    public int topLeftPoint;
    public int bottomRightPoint;

    Rectangle(int first, int second){
        this.topLeftPoint = first;
        this.bottomRightPoint = second;
      }

    Rectangle(Rectangle first, Rectangle second) {
        topLeftPoint = first.getFirstPoint();
        topLeftPoint = second.getFirstPoint();
        bottomRightPoint = first.getSecondPoints();
        bottomRightPoint = second.getSecondPoints();


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

    public int getPerimeter(Rectangle first, Rectangle second) {

        int aA = (a - a1);
        int bB = (b - b1);
        int P;
        if (aA < 0)
            aA *= -1;

        if (bB < 0)
            bB *= -1;

        P = (aA + bB) * 2;
        return P;
    }

    public int getArea(int a, int a1, int b, int b1) {
        int aA = (a - a1);
        int bB = (b - b1);
        int S = aA * bB;
        if (S < 0)
            S *= -1;
        return S;
    }
}
