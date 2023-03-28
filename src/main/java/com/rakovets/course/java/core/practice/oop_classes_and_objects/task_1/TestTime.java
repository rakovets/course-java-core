package com.rakovets.course.java.core.practice.oop_classes_and_objects.task_1;

public class TestTime {
    public static void main(String[] args) {
        Time time = new Time(3600);
        time.getSeconds();
        time.getMinutes();
        time.getHours();
        time.setSeconds(60);
        time.setMinutes(50);
        time.setHours(2);
        //проверка установленных значений
        time.getSeconds();
        time.getMinutes();
        time.getHours();
        time.getTotalSeconds();

        Time timeTwo = new Time(5, 4, 30);
        time.getSeconds();
        time.getMinutes();
        time.getHours();
    }
}
