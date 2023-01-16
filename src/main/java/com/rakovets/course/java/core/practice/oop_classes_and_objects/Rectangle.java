package com.rakovets.course.java.core.practice.oop_classes_and_objects;


public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public Point getBottomRightPoint() {
        return bottomRightPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;

    }

    public double rectanglePerimetr() {
        double sideA = Math.abs(topLeftPoint.getX() - this.bottomRightPoint.getX());
        double diagonal = topLeftPoint.getDistance(bottomRightPoint);


        double perimetr = 2 * (sideA + Math.sqrt(
                (Math.pow(diagonal, 2) - Math.pow(sideA, 2))));
        System.out.println("Perimetr rectangle = " + perimetr);
        return perimetr;

    }

    public double rectangleSqure() {
        double sideA = Math.abs(topLeftPoint.getX() - this.bottomRightPoint.getX());
        double diagonal = topLeftPoint.getDistance(bottomRightPoint);
        double squre = sideA * Math.sqrt((Math.pow(diagonal, 2) - Math.pow(sideA, 2)));
        System.out.println("Squre rectangle =  " + squre);
        return squre;
    }
}




