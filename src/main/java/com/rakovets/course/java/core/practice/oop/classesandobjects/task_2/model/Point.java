package com.rakovets.course.java.core.practice.oop.classesandobjects.task_2.model;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y)  {
        this.x = x;
        this.y = y;
    }
    public double getX()  {
        return this.x;
    }
    public  void setX(double x)  {
        this.x = x;
    }
    public double getY()  {
        return this.y;
    }
    public void setY(double y)  {
        this.y = y;
    }
    public void distance(Point nextPoint) {
        double distance = Math.sqrt(Math.pow(nextPoint.x - this.x, 2) + Math.pow(nextPoint.y - this.y, 2));
        System.out.printf("Distance: %f \n", distance);
    }
}

