package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,6);
        System.out.println("first point: " + rectangle.getFirstPoint());
        System.out.println("second point: " + rectangle.getSecondPoint());
        //System.out.println(getPerimeter);

        rectangle.setFirstPoint(7);
        rectangle.setSecondPoint(9);

        System.out.println("first point: " + rectangle.getFirstPoint());
        System.out.println("second point: " + rectangle.getSecondPoint());
    }
}
