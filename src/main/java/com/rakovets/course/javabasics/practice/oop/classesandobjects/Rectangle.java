package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {
    public int firstPoint;
    public int secondPoints;

    public Rectangle(Rectangle first, Rectangle second) {

    }

    public void setFirstPoint(int first) {
        this.firstPoint = first;

    }

    public void setSecondPoint(int second) {
        this.secondPoints = second;

    }

    public int getFirstPoint() {
        return this.firstPoint;
    }

    public int getSecondPointsPoint() {
        return this.secondPoints;
    }

    public int getPerimeter(int a, int a1, int b, int b1) {
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
