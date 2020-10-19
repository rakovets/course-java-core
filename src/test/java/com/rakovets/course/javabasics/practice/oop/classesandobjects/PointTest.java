package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class PointTest {
    public static void main(String[] args) {
       Point pointx = new Point(1);
       Point pointy = new Point(2);
        System.out.println("координата точки X:" + pointx.getX());
        System.out.println("координата точки Y:" + pointy.getY());

        pointx.setX(5);
        pointy.setY(8);
        System.out.println(pointx.getX());
        System.out.println(pointy.getY());
    }
}
