package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class PointTest {
    public static void main(String[] args) {
//       Point point = new Point();
       Point point = new Point(1, 3);
        System.out.println("координата точки X:" + point.getX());
        System.out.println("координата точки Y:" + point.getY());

        point.setX(5);
        point.setY(8);
        System.out.println(point.getX());
        System.out.println(point.getY());
    }


}
