package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Point onePoint = new Point(2,5);
        Point twoPoint =new Point(4,10);
        Rectangle rectangle = new Rectangle(onePoint,twoPoint);
        System.out.printf("Current position \nX : %d Y : %d\nX : %d Y : %d\n",rectangle.getFirstPoint().getX(),
                           rectangle.getFirstPoint().getY(),rectangle.getSecondPoint().getX(),rectangle.getSecondPoint().getY());
        System.out.printf("Perimeter : %f\n",rectangle.getPerimeter());
        System.out.printf("Area :%f\n",rectangle.getArea());
        Point xPoints =new Point(40,50);
        rectangle.setFirstPoint(xPoints);
        System.out.printf("Perimeter : %f\n",rectangle.getPerimeter());
        System.out.printf("Area :%f\n",rectangle.getArea());

    }

}
