package com.rakovets.course.challenge.oop.classes;

public class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point point) {
        double difX = this.x - point.getX();
        double difY = this.y - point.getY();
        double secondPositionX = Math.pow(difX, 2);
        double secondPositionY = Math.pow(difY, 2);
        double summ = secondPositionX + secondPositionY;
        double result = Math.sqrt(summ);
        return result;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

}
