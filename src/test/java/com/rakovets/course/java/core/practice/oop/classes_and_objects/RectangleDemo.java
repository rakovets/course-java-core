package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(3,4), new Point(5,6));
        System.out.printf("%d \n%d", rectangle.getFirstPoint().getxPoint(), rectangle.getFirstPoint().getyPoint());
        System.out.printf("\n%d \n%d", rectangle.getSecondPoint().getxPoint(), rectangle.getSecondPoint().getyPoint());
        rectangle.setFirstPoint(new Point(7,8));
        rectangle.setSecondPoint(new Point(9,10));
        System.out.printf("\n%d \n%d", rectangle.getFirstPoint().getxPoint(), rectangle.getFirstPoint().getyPoint());
        System.out.printf("\n%d \n%d", rectangle.getSecondPoint().getxPoint(), rectangle.getSecondPoint().getyPoint());
        System.out.printf("\n%d", rectangle.getPerimeter());
        System.out.printf("\n%d", rectangle.getArea());
    }
}
