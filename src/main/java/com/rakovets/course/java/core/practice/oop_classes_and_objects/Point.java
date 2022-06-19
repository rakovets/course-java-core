package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.util.NumberUtil;

public class Point {

    private double x = 2;
    private double y = 4;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point () {}

     public double getX () {
        return this.x;
     }

     public double setX (int x) {
        return x;
     }

     public double getY () {
        return this.y;
     }

    public double setY (int y) {
        return y;
    }

    public double getDistance (Point newPoint) {
        double distance = Math.sqrt(Math.pow(x - newPoint.x, 2) + Math.pow(y - newPoint.y, 2));
        return NumberUtil.roundValueToTwoDigitsForMantissa(distance);
    }
}

