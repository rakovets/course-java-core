package com.rakovets.course.challenge.classes;

public class Point {
    private double x;
    private double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point Point1){
        double result = Math.sqrt(Math.pow(this.x - Point1.getX(), 2) + Math.pow(this.y - Point1.getY(), 2));
        return result;
    }
}
