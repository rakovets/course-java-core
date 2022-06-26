package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point (double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double getDistance(Point disnancePoint) {
        double squareDistanceX = Math.pow(this.pointX - disnancePoint.getPointX(), 2);
        double squareDistanceY = Math.pow(this.pointY - disnancePoint.getPointY(), 2);
        return Math.sqrt(squareDistanceX + squareDistanceY);
    }
}
