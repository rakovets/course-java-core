package com.rakovets.course.challenge.oop.polimorphism.geometry;

public class workWithFigure {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 3, 4);
        triangle.ariaOfFigure(triangle);
        Rectangle rectangle = new Rectangle(3, 5, 3, 5);
        rectangle.ariaOfFigure(rectangle);
        triangle.equalFigures(triangle,rectangle);
        triangle.checkOnShape(triangle);
        rectangle.checkOnShape(rectangle);
        triangle.heightOfTriangle(triangle);
        rectangle.diagonalOfRectangle(rectangle);
    }
}
