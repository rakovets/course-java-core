package com.rakovets.course.challenge.classes;

public class Rectangle {
    private Point pointLT;
    private Point pointRU;

    Rectangle(Point point1, Point point2){
        this.pointLT = point1;
        this.pointRU = point2;
    }

    public Point getPointLT() {
        return this.pointLT;
    }

    public Point getPointRU() {
        return this.pointRU;
    }

    public void setPointLT(Point pointLT) {
        this.pointLT = pointLT;
    }

    public void setPointRU(Point pointRU) {
        this.pointRU = pointRU;
    }

    public double area(){
        double resultArea = (pointRU.getX() - pointLT.getX()) * (pointLT.getY() - pointRU.getY());
        return resultArea;
    }

    public double perimeter(){
        double resultPerimetr = ((pointRU.getX() - pointLT.getX()) + (pointLT.getY() - pointRU.getY()) * 2);
        return resultPerimetr;
    }
}
