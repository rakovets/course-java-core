package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
    public static void main(String[] args){
        Time time = new Time(2,13,39);
        System.out.println(time.getHours() +" "+time.getMinutes()+" "+ time.getSeconds());
        Time time2 = new Time(8019);
        System.out.println(time2.getHours() +" "+time2.getMinutes()+" "+ time2.getSeconds());

    }
}
