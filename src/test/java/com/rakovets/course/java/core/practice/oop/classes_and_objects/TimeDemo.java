package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
        public static void main(String[] args) {
            Time time = new Time (1,2,3);
            Time timeTotalSeconds = new Time (19825);
            System.out.printf ("%d:%d:%d\n", time.getHours(),time.getMinutes(),time.getSeconds());
            System.out.printf ("%d:%d:%d\n", timeTotalSeconds.getHours(),timeTotalSeconds.getMinutes(),timeTotalSeconds.getSeconds());

            time.setHours(10);
            time.setMinutes(50);
            time.setSeconds(39);
            System.out.printf ("%d:%d:%d\n", time.getHours(),time.getMinutes(),time.getSeconds());
            System.out.printf ("%d\n", time.getTotalSeconds());

        }
}
