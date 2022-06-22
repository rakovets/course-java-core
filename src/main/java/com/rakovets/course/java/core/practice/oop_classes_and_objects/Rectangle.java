package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private double topLeftPoint;
    private double bottomRightPoint;
    public Rectangle (double topLeftPoint, double bottomRightPoint) {
        if (topLeftPoint < 0 || bottomRightPoint < 0) {
            System.out.println("Please, enter value Point > 0");
            return;
        } else {
            this.topLeftPoint = topLeftPoint;
            this.bottomRightPoint = bottomRightPoint;
        }
    }

    public double topLeftPoint() {
        return this.topLeftPoint;
    }

    public double bottomRightPoint() {
        return this.bottomRightPoint;
    }
}
