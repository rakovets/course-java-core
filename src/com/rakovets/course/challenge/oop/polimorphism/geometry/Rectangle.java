package com.rakovets.course.challenge.oop.polimorphism.geometry;

public class Rectangle extends Figure implements Printable {
    public Rectangle(double x, double y, double z, double m) {
        super(x, y, z, m);
    }

    @Override
    public double ariaOfFigure(Figure f) {
        double area = f.firstSide * f.secondSide;
        System.out.printf("\nArea of rectangle is %f", area);
        this.area = area;
        return area;
    }

    public void diagonalOfRectangle(Figure f) {
        double diagonal = Math.sqrt(f.firstSide) + Math.sqrt(f.secondSide);
        System.out.printf("\nDiagonal of rectangle: %f", diagonal);
    }

    @Override
    public String toString() {
        return String.format("\nRectangle {First side = %f, second side = %f, third side = %f, furth side = %f, area = %f}", firstSide, secondSide, thirdSide, furthSide, this.area);
    }

    @Override
    public void printInformationAboutFigure() {
        System.out.println(toString());
    }
}
