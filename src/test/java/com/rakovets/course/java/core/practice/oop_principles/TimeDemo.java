package com.rakovets.course.java.core.practice.oop_principles;


public class TimeDemo {
    public static void main(String[] args) {

        Time time = new Time(18426);
        System.out.println(time.getHours()+ " : " + time.getMinutes()+ " : " + time.getSeconds());

        Time time1 = new Time(5, 7, 6);
        time1.setHours(8);
        time1.setMinutes(18);
        time1.setSeconds(45);
        System.out.println(time1.getHours() + " : " + time1.getMinutes() + " : " +  time1.getSeconds());
        Time time2 = new Time(4,56,23);
        System.out.println(time2.getHours() + ":" +time2.getMinutes() + ":" + time2.getSeconds());
    }
}
