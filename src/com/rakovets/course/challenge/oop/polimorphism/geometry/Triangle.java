package com.rakovets.course.challenge.oop.polimorphism.geometry;

public class Triangle extends Figure {
    public Triangle(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public double ariaOfFigure(Figure f) {
        double p = (f.x + f.y + f.z) / 2;
        double area = Math.sqrt(p * (p - f.x) * (p - f.y) * (p - f.z));
        System.out.printf("\nArea of triangle is %f", area);
        this.area = area;
        return area;
    }

    public void heightOfTriangle(Figure f) {
        double h = (2 * this.area) / f.x;
        System.out.printf("\nIf height held to x side, h: %f", h);
    }


}
