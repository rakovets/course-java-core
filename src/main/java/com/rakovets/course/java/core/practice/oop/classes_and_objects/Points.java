package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Points {
    private int pointX;
    private int pointY;

    public Points (int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public int getX() {
        return pointX;
    }

    public int getY() {
        return pointY;
    }

    public void setX(int pointX) {
        this.pointX=pointX;
    }

    public void setY(int pointY) {
        this.pointY=pointY;
    }

    public double getDistance(Points points) {
        return Math.sqrt(Math.pow(pointX - points.pointX, 2) + Math.pow(pointY - points.pointY, 2));
    }
}
