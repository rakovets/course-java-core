package com.rakovets.course.java.core.practice.exception_handling;

public class Task2 {
    public String arrayOutOfBounds() {
        String[] colors = new String[5];
        colors[7] = "GREEN";
        return colors[7];
    }
}
