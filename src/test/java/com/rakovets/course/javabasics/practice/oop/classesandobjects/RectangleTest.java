package com.rakovets.course.javabasics.practice.oop.classesandobjects;
import com.rakovets.course.javabasics.practice.oop.classesandobjects.constants.ColorConsants;


public class RectangleTest {
    public static void main(String[] args) {

        System.out.println(ColorConsants.ANSI_RED + "Start program \n" + ColorConsants.ANSI_RESET);
        Point firstPoint = new Point(5, 5);
        Point secondPoint = new Point(10, 1);
        Rectangle per = new Rectangle(firstPoint, secondPoint);

       System.out.println(ColorConsants.ANSI_YELLOW + "Points are  :" + ColorConsants.ANSI_RESET + firstPoint);
       System.out.println(ColorConsants.ANSI_RED + "Perimeter is :" + ColorConsants.ANSI_RESET + per.getPerimeter());
       System.out.println(ColorConsants.ANSI_GREEN + "Area is :" + ColorConsants.ANSI_RESET + per.getArea());




    }
}
