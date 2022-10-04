package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * According to the Pythagorean theorem, the sum of the squares of the lengths of the triangle's legs
     * is the same as the square of the length of the triangle's hypotenuse: AB2 = AC2 + CB2.
     * A(x1, y1)
     * B(x2, y2)
     * C(x1, y2)
     */
    public double getDistance(Point point) {
        double distance = Math.sqrt((this.getX() - point.getX()) * (this.getX() - point.getX())
                + (this.getY() - point.getY()) * (this.getY() - point.getY()));
        return distance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
