package com.rakovets.course.challenge.oop.polimorphism.geometry;

public class Rectangle extends Figure {
    public Rectangle(double x, double y, double z, double m) {
        super(x, y, z, m);
    }

    @Override
    public double ariaOfFigure(Figure f) {
        double area = f.x * f.y;
        System.out.printf("\nArea of rectangle is %f", area);
        this.area = area;
        return area;
    }

    public void diagonalOfRectangle(Figure f) {
        double diagonal = Math.sqrt(f.x) + Math.sqrt(f.y);
        System.out.printf("\nDiagonal of rectangle: %f", diagonal);
    }
}
