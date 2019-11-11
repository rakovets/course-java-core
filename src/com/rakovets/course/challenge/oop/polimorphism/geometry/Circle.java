package com.rakovets.course.challenge.oop.polimorphism.geometry;

public class Circle extends Figure implements Printable {
    double perimeter;

    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double ariaOfFigure(Figure f) {
        double area = 2 * Math.PI * f.radius * f.radius;
        System.out.printf("\nArea of circle is %f", area);
        return this.area = area;
    }

    public double perimeterOfCircle(Figure f) {
        perimeter = 2 * Math.PI * f.radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return String.format("Circle {Radius = %f, area = %f, perimeter = %f}", this.radius, this.area, this.perimeter);
    }

    @Override
    public void printInformationAboutFigure() {
        System.out.println(toString());
    }
}
