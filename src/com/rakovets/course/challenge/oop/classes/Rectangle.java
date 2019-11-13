package com.rakovets.course.challenge.oop.classes;

public class Rectangle {
    private Point pointLT;
    private Point pointRU;


    Rectangle(Point point, Point point1) {
        this.pointLT = point;
        this.pointRU = point1;
    }

    double FindArea() {
        double fintPoint1 = pointLT.getX() - pointRU.getX();
        double findPoint2 = pointLT.getY() - pointRU.getY();
        double resultOfArae = fintPoint1 * findPoint2;
        return resultOfArae;
    }

    double FindPerim() {
        double FirstСoordinate = pointLT.getX() - pointRU.getX();
        double SecondСoordinate = pointLT.getY() - pointRU.getY();
        double result = (FirstСoordinate * 2) + (SecondСoordinate * 2);
        return result;
    }

    public Point getPointLT() {
        return pointLT;
    }

    public Point getPointRU() {
        return pointRU;
    }

    public void setPointLT(Point pointLT) {
        this.pointLT = pointLT;
    }

    public void setPointRU(Point pointRU) {
        this.pointRU = pointRU;
    }

}
