package com.rakovets.course.challenge;

public class Rectangle {
    private Point pointLT;
    private Point pointRU;

    public Rectangle(Point pointLT, Point pointRU) {
        this.pointLT = pointLT;
        this.pointRU = pointRU;
    }

    public Point getPointLT() {
        return this.pointLT;
    }

    public Point getPointRU() {
        return this.pointRU;
    }

    void display(){
        System.out.println("Rectangle:");
        this.pointLT.display();
        this.pointRU.display();
    }

    public void setPointLT(Point point) {
        this.pointLT = point;
    }

    public void setPointRU(Point point) {
        this.pointRU = point;
    }
    double area(){
        return Math.abs(this.pointRU.getX() - this.pointLT.getX()) * Math.abs(this.pointLT.getY() - this.pointRU.getY());
    }

    double perimeter (){
        return 2 * (Math.abs(this.pointRU.getX() - this.pointLT.getX()) + Math.abs(this.pointLT.getY() - this.pointRU.getY()));
    }
}
