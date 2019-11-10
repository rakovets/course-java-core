package com.rakovets.course.challenge.oop.polimorphism.geometry;

public class Figure implements EqualFigures, ShapeUtils {
    double x;
    double y;
    double z;
    double m;
    double area;

    public Figure(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public Figure(double x, double y, double z, double m) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.m = m;
    }

   public double ariaOfFigure(Figure f) {
        return area;
   }

    @Override
    public void equalFigures(Figure a, Figure b) {
        if (a.area == b.area) {
            System.out.println("\nFigures are similar.");
        } else {
            System.out.println("\nFigures are not similar.");
        }
    }
}
