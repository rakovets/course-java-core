package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Test;

public class TimeDemo {
    @Test
    public static void main(String[]   args) {

        Time time = new Time (6000);
        System.out.println("Hours " + time.getHours());
        System.out.println("Minutes " + time.getMinutes());
        System.out.println("Seconds " +time.getSeconds());
        System.out.println();
        System.out.println( "Total time " + time.totalTimeInSeconds());
    }
}
