package com.rakovets.course.challenge.oopClassesAndObjects;

public class Restangle {
    Point pointLT;
    Point pointRU;

    Restangle(Point pointLT, Point pointRU) {
        this.pointLT = pointLT;
        this.pointRU = pointRU;
    }

    void display() {
        System.out.printf("Restangle \n");
        this.pointLT.display();
        this.pointRU.display();
    }

    Point getPointLT() {
        return this.pointLT;
    }

    Point getPointRU() {
        return this.pointRU;
    }

    void setPointRU(Point point) {
        this.pointRU = pointRU;
    }

    void setPointLT(Point point) {
        this.pointLT = pointLT;
    }

    double area() {
        return Math.abs(this.pointRU.getX() - this.pointLT.getX()) * Math.abs(this.pointRU.getY() - this.pointLT.getY());
    }

    double perimeter() {
        return 2 * (Math.abs(this.pointRU.getX() - this.pointLT.getX()) + Math.abs(this.pointRU.getY() - this.pointLT.getY()));
    }
}
