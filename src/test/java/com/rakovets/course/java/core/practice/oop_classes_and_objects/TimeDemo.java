package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.practice.oop_classes_and_objects.Time;

public class TimeDemo {
    public static void main(String[] args) {
        Time totalSeconds = new Time (2022);
        System.out.println(totalSeconds.getHours() + " : " + totalSeconds.getMinutes() + " : " + totalSeconds.getSeconds());

        Time hMinSec = new Time(2, 20, 2);
        hMinSec.setHours(5);
        hMinSec.setMinutes(27);
        hMinSec.setSeconds(35);
        System.out.println(hMinSec.getHours() + " : " + hMinSec.getMinutes() + " : " + hMinSec.getSeconds());
        System.out.println("Total seconds: " +  hMinSec.getTotalSeconds());
    }
}
