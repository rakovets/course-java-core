package com.rakovets.course.challenge.oop.objects;

class Rectangle {
    private Point pointLT;
    private Point pointRU;

    Rectangle(Point pointLT, Point pointRU) {
        this.pointLT = pointLT;
        this.pointRU = pointRU;
    }

    void display() {
        System.out.printf("Rectangle = \nPointLT: ");
        this.pointLT.display();
        System.out.printf("PointRU: ");
        this.pointRU.display();
    }

    Point getPointLT() {
        return this.pointLT;
    }

    void setPointLT(Point pointLT) {
        this.pointLT = pointLT;
    }

    Point getPointRU() {
        return this.pointRU;
    }

    void setPointRU(Point pointRU) {
        this.pointRU = pointRU;
    }

    double area() {
        return Math.abs((this.pointRU.getX() - this.pointLT.getX()) *
                (this.pointRU.getY() - this.pointLT.getY()));
    }

    double perimeter() {
        return (Math.abs(this.pointRU.getX() - this.pointLT.getX()) +
                Math.abs(this.pointRU.getY() - this.pointLT.getY())) * 2;
    }
}
