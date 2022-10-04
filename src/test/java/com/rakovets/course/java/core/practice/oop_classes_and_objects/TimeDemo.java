package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        System.out.println("**Samples for 1st constructor + getters + getTotalSeconds**");
        Time sample01 = new Time(0, 0, 0);
        System.out.printf("Current time: %d hours %d minutes %d seconds\n", sample01.getHours(), sample01.getMinutes(), sample01.getSeconds());
        System.out.printf("Current time in total seconds: %d\n", sample01.getTotalSeconds());
        System.out.println("-----");

        Time sample02 = new Time(0, 0, 59);
        System.out.printf("Current time: %d hours %d minutes %d seconds\n", sample02.getHours(), sample02.getMinutes(), sample02.getSeconds());
        System.out.printf("Current time in total seconds: %d\n", sample02.getTotalSeconds());
        System.out.println("-----");

        Time sample03 = new Time(0, 59, 59);
        System.out.printf("Current time: %d hours %d minutes %d seconds\n", sample03.getHours(), sample03.getMinutes(), sample03.getSeconds());
        System.out.printf("Current time in total seconds: %d\n", sample03.getTotalSeconds());
        System.out.println("-----");

        Time sample04 = new Time(1, 1, 1);
        System.out.printf("Current time: %d hours %d minutes %d seconds\n", sample04.getHours(), sample04.getMinutes(), sample04.getSeconds());
        System.out.printf("Current time in total seconds: %d\n", sample04.getTotalSeconds());

        System.out.println("\n**Samples for 2nd constructor + getters**");
        Time sample05 = new Time(0);
        System.out.printf("Current time: %d hours %d minutes %d seconds\n", sample05.getHours(), sample05.getMinutes(), sample05.getSeconds());

        Time sample06 = new Time(59);
        System.out.printf("Current time: %d hours %d minutes %d seconds\n", sample06.getHours(), sample06.getMinutes(), sample06.getSeconds());

        Time sample07 = new Time(119);
        System.out.printf("Current time: %d hours %d minutes %d seconds\n", sample07.getHours(), sample07.getMinutes(), sample07.getSeconds());

        Time sample08 = new Time(3601);
        System.out.printf("Current time: %d hours %d minutes %d seconds\n", sample08.getHours(), sample08.getMinutes(), sample08.getSeconds());

        System.out.println("\n**Sample for setters**");
        Time sample09 = new Time(0, 0, 0);
        System.out.printf("Current time BEFORE using setters: %d hours %d minutes %d seconds\n", sample09.getHours(), sample09.getMinutes(), sample09.getSeconds());
        sample09.setSeconds(1);
        sample09.setMinutes(59);
        sample09.setHours(3);
        System.out.printf("Current time AFTER using setters: %d hours %d minutes %d seconds\n", sample09.getHours(), sample09.getMinutes(), sample09.getSeconds());
    }
}
