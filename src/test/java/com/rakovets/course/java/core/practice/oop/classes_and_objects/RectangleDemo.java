package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Points onePoint = new Points(2,5);
        Points twoPoint =new Points(4,10);
        Rectangle rectangle = new Rectangle(onePoint,twoPoint);
        System.out.printf("Current position \nX : %s\nX : %s\n",rectangle.getFirstPoint().getX(),rectangle.getSecondPoint().getX());
        System.out.printf("Perimeter : %f\n",rectangle.getPerimeter());
        System.out.printf("Area :%f\n",rectangle.getArea());
        Points xPoints =new Points(40,50);
        rectangle.setFirstPoint(xPoints);
        System.out.printf("Perimeter : %f\n",rectangle.getPerimeter());
        System.out.printf("Area :%f\n",rectangle.getArea());

    }

}
