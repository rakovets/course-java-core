package com.rakovets.course.challenge.oop.first_task;

public class CountSeconds {
    int seconds = 0;
    CountSeconds(int s,int m,int o) {
        seconds = s + (m * 60) + (o * 60 * 60);
    }
    void displayInfo() {
        System.out.println("Seconds: " + seconds);
    }
}
