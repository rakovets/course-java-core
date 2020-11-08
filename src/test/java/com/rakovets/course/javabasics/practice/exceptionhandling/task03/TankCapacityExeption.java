package com.rakovets.course.javabasics.practice.exceptionhandling.task03;

public class TankCapacityExeption extends Exception {

    private final int capacity;

    public TankCapacityExeption(String message, int liters) {
        super(message);
        capacity = liters;
    }
}