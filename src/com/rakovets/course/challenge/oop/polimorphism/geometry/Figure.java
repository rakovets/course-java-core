package com.rakovets.course.challenge.oop.polimorphism.geometry;

public abstract class Figure implements EqualFigures, ShapeUtils {
    double firstSide;
    double secondSide;
    double thirdSide;
    double furthSide;
    double area;
    double radius;

    public Figure(double radius) {
        this.radius = radius;
    }

    public Figure(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }


    public Figure(double firstSide, double secondSide, double thirdSide, double furthSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.furthSide = furthSide;
    }

   public abstract double ariaOfFigure(Figure f);

    @Override
    public void equalFigures(Figure a, Figure b) {
        if (a.area == b.area) {
            System.out.println("\nFigures are similar.");
        } else {
            System.out.println("\nFigures are not similar.");
        }
    }

    public abstract String toString();
}
