package com.rakovets.course.challenge.oop.first_task;

public class Point {
    double x;
    double y;

    Point(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        System.out.printf("Set x for new point: %f\n", x);
        this.x = x;
    }

    public void setY(double y) {
        System.out.printf("Set y for new point: %f\n", y);
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void distance(Point newPoint) {
        double disX = this.x - newPoint.getX();
        double disY = this.y - newPoint.getY();
        double distance = Math.sqrt(Math.pow(disX, 2) + Math.pow(disY, 2));
        System.out.printf("distanse betwin point1 and point2: %f",distance);
    }
}
