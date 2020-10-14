package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    Rectangle(Point first, Point second) {
        this.topLeftPoint = first;
        this.bottomRightPoint = second;
            }

    public void setFirstPoint(Point first) {
        this.topLeftPoint = first;

    }

    public void setSecondPoint(Point second) {
        this.bottomRightPoint = second;

    }

    public Point getFirstPoint() {
        return this.topLeftPoint;
    }

    public Point getSecondPoints() {
        return this.bottomRightPoint;
    }

    public double getPerimeter() {
        double aSide = Math.abs((topLeftPoint.getX() - bottomRightPoint.getX())*2 );
        double bSide = Math.abs((topLeftPoint.getY() - bottomRightPoint.getY())*2 );
        double P = aSide + bSide;
        return P;
    }

    public double getArea() {
        double aSide = Math.abs((topLeftPoint.getX() - bottomRightPoint.getX())*2 );
        double bSide = Math.abs((topLeftPoint.getY() - bottomRightPoint.getY())*2 );
        double S = aSide * bSide;
        return S;
    }
}
