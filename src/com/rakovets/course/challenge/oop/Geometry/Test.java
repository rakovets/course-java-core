package com.rakovets.course.challenge.oop.Geometry;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle", 4, 5, 8, 9);
        Triangle triangle = new Triangle("Triangle", 4, 5, 8, 6, 2, 3, 4);
        Circle circle = new Circle("Circle", 6);
        System.out.println();
        rectangle.CalculetePerimeter();
        rectangle.CalculeteArea();
        triangle.CalculetePerimeter();
        triangle.CalculeteArea();
        circle.CalculetePerimeter();
        circle.CalculeteArea();
        System.out.println(circle.toString());
        System.out.println(triangle.toString());
        System.out.println(rectangle.toString());
        System.out.println(ShapeUtils.isRectangle(rectangle));
        System.out.println(ShapeUtils.isTriangle(triangle));
        System.out.println(triangle.isAreaIsSame(rectangle));
        System.out.println(rectangle.isAreaIsSame(triangle));
        System.out.println(ShapeUtils.isCircle(circle));
    }
}
