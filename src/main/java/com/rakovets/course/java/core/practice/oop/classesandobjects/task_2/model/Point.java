package com.rakovets.course.java.core.practice.oop.classesandobjects.task_2.model;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y)  {
        this.x = x;
        this.y = y;
    }

    public void getX()  {
        System.out.printf("x = %f \n", this.x);
    }
    public  void setX(double x)  {
        this.x = x;
    }
    public void getY()  {
        System.out.printf("y = %f \n", this.y);
    }
    public void setY(double y)  {
        this.y = y;
    }
    public void distance(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        System.out.printf("Distance: %f \n", distance);
    }
}

