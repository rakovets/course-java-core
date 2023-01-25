package com.rakovets.course.java.core.practice.oop_principles.test;

public class Circle extends Figure implements Length {
    private final double radius;

    private final double diameter;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = 2 * radius;
    }

    @Override
    public String toString() {
        String result;

        result = "This is Circle with next parameters:\nRadius: " + this.getRadius() + "\nDiameter: " +
                this.getDiameter() + "\nLength: " + this.length() + "\nArea: " + this.area();

        return result;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double length() {
        return 2 * Math.PI * getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }
}
