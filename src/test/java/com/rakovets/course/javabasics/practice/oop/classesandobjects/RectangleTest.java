package com.rakovets.course.javabasics.practice.oop.classesandobjects;

import com.rakovets.course.javabasics.practice.oop.classesandobjects.constants.ColorConsants;


public class RectangleTest {
    public static void main(String[] args) {

        System.out.println(ColorConsants.ANSI_RED + "...Start program... \n" + ColorConsants.ANSI_RESET);
        Point firstPoint = new Point(5, 5);
        Point secondPoint = new Point(10, 1);
        Rectangle result = new Rectangle(firstPoint, secondPoint);
        System.out.println(ColorConsants.ANSI_RED + "Perimeter is :" + ColorConsants.ANSI_RESET + result.getPerimeter());
        System.out.println(ColorConsants.ANSI_GREEN + "Area is :" + ColorConsants.ANSI_RESET + result.getArea());

        System.out.println(ColorConsants.ANSI_RED + "\n...Checking 'Set' methods... \n" + ColorConsants.ANSI_RESET);
        Point firstPointSet = new Point(10, 15);
        Point secondPointSet = new Point(14, 17);
        Rectangle resultSet = new Rectangle(firstPointSet, secondPointSet);
        resultSet.setFirstPoint(firstPointSet);
        resultSet.setSecondPoint(secondPointSet);

        System.out.println(ColorConsants.ANSI_RED + "Perimeter is :" + ColorConsants.ANSI_RESET + resultSet.getPerimeter());
        System.out.println(ColorConsants.ANSI_GREEN + "Area is :" + ColorConsants.ANSI_RESET + resultSet.getArea());


    }
}
