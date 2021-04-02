package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args){
        Point pointOne = new Point(1,1);
        System.out.println(pointOne.getDistance(new Point(3,3)));
    }
}
