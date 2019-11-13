package com.rakovets.course.challenge.oop.classes;

public class Timeinterval {
    int second;
    int minutes;
    int hours;

    Timeinterval(int second) {
        this.second = second;
    }

    void printSeconds() {
        System.out.println(this.second);
    }

    Timeinterval(int second, int minutes, int hours) {
        this.second = second;
        this.minutes = minutes;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Timeinterval{" +
                "second=" + second +
                ", minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }
}
