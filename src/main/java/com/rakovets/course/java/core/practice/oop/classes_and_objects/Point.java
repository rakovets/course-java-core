package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Point {
    private int xPoint;
    private int yPoint;

    public Point (int xPoint, int yPoint) {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }
    public int getxPoint() {
        return xPoint;
    }
    public int getyPoint() {
        return yPoint;
    }
    public void setxPoint(int xPoint) {
        this.xPoint = xPoint;
    }
    public void setyPoint(int yPoint) {
        this.yPoint = yPoint;
    }
    public int getDistance (Point secondPoint) {
        return (int) Math.sqrt((this.xPoint - secondPoint.xPoint) * (this.xPoint - secondPoint.xPoint) + (this.yPoint - secondPoint.yPoint) * (this.yPoint - secondPoint.yPoint));
    }
    public int getDistance (int secondPoint, String Axis) {
        switch (Axis){
            case "X":return (int) Math.abs(xPoint-secondPoint);
            case "Y":return (int) Math.abs(yPoint-secondPoint);
        }
        return 0;
    }
}
