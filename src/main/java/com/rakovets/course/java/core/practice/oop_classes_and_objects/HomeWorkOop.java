package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class HomeWorkOop {
    public static void main(String[]  args){
        MyTime time = new MyTime(3661);
        System.out.println("Hours " + time.getHours());
        System.out.println("Minutes " + time.getMinutes());
        System.out.println("Seconds " +time.getSeconds());
        System.out.println();
        System.out.println( "Total time " + time.totalTimeInSeconds());

        Point pointFirst = new Point(3, 5);
        Point pointTwo = new Point(8, 1);
        System.out.println();
        System.out.println("Length line " + pointFirst.getDistance(pointTwo));

        Rectangle rectangle = new Rectangle(pointFirst, pointTwo);
        rectangle.rectanglePerimetr();
        rectangle.rectangleSqure();
    }

}
