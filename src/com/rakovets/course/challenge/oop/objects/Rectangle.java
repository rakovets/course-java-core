package com.rakovets.course.challenge.oop.objects;

class Rectangle {
    private double pointLT;
    private double pointRU;

    Rectangle(double pointLT, double pointRU) {
        this.pointLT = pointLT;
        this.pointRU = pointRU;
    }

    void display() {
        System.out.printf("PointLT = %.2f, PointRU = %.2f\n", this.pointLT, this.pointRU);
    }

    public double getPointLT() {
        return this.pointLT;
    }

    void setPointLT(double pointLT) {
        this.pointLT = pointLT;
    }

    public double getPointRU() {
        return this.pointRU;
    }

    void setPointRU(double pointRU) {
        this.pointRU = pointRU;
    }

    public double area(Rectangle rectangle) {
        return this.pointLT * this.pointRU;
    }

    public double perimeter(Rectangle rectangle) {
        return (this.pointLT + this.pointRU) * 2;
    }
}

