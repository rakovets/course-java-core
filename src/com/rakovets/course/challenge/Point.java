package com.rakovets.course.challenge;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.printf("(%.2f;%.2f)\n", this.x, this.y);
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
    double distanse(Point point){
        return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }
}
