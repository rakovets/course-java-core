package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class Rectangle extends Figure implements Diagonal, Perimeter {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        String result;

        result = "This is Rectangle with next parameters:\nSide A: " + this.getSideA() + "\nSide B: " +
                getSideB() + "\nPerimeter: " + this.perimeter() + "\nArea: " + this.area() + "\nDiagonal: " +
                this.diagonal();

        return result;
    }

    @Override
    public double area() {
        double result;

        result = getSideA() * getSideB();

        return result;
    }

    @Override
    public double perimeter() {
        double result;

        result = 2 * (getSideA() + getSideB());

        return result;
    }

    @Override
    public double diagonal() {
        double result;

        result = Math.sqrt(Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2));

        return result;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
