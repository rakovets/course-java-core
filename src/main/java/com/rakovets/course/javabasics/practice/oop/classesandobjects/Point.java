package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point second) {
        int a = second.x - this.x;
        int b = second.y - this.y;
        double dist = Math.sqrt(a*a + b*b);
        return dist;
        }

    }



