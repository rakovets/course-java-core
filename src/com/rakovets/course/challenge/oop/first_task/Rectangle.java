package com.rakovets.course.challenge.oop.first_task;

public class Rectangle {
    double x;
    double y;
    Rectangle(double x,double y) {
        this.x = x;
        this.y = y;
        System.out.printf("New point are set: x = %f, y = %f\n", x, y);
    }
    void setX(double x) {
        System.out.printf("set new x: %f\n",x);
        this.x = x;
    }
    double getX() {
        return x;
    }
    void setY(double y) {
        System.out.printf("set new y: %f\n",y);
        this.y = y;
    }
    double getY() {
        return y;
    }
    void distance(Rectangle newPoint2, Rectangle newPoint) {
        double disX = newPoint.getX() - newPoint2.getX();
        double disY = newPoint.getY() - newPoint2.getY();
        double disBetweenPoints = Math.sqrt(Math.pow(disX,2) + Math.pow(disY,2));
        System.out.printf("distanse betwin point1 and point2: %f",disBetweenPoints);
    }
}
