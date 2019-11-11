package com.rakovets.course.challenge.oop.polimorphism.geometry;


public class Triangle extends Figure implements Printable {
    public Triangle(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public double ariaOfFigure(Figure f) {
        double p = (f.firstSide + f.secondSide + f.thirdSide) / 2;
        double area = Math.sqrt(p * (p - f.firstSide) * (p - f.secondSide) * (p - f.thirdSide));
        System.out.printf("\nArea of triangle is %f", area);
        this.area = area;
        return area;
    }

    public void heightOfTriangle(Figure f) {
        double h = (2 * this.area) / f.firstSide;
        System.out.printf("\nIf height held to x side, h: %f", h);
    }

    @Override
    public String toString() {
        return String.format("\nTriangle {First side = %f, second side = %f, third side = %f, area = %f}", firstSide, secondSide, thirdSide, this.area);
    }

    @Override
    public void printInformationAboutFigure() {
        System.out.println(toString());
    }
}
