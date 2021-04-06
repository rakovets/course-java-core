package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5,10);
        System.out.printf("%f %f \n",rectangle.getFirstPoint(),rectangle.getSecondPoint());
        System.out.printf("%f \n", rectangle.getArea(rectangle.getFirstPoint(), rectangle.getSecondPoint()));
        System.out.printf("%f\n", rectangle.getPerimeter(rectangle.getFirstPoint(), rectangle.getSecondPoint()));
    }


}
