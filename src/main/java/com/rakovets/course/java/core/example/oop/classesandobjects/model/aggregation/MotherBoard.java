package com.rakovets.course.java.core.example.oop.classesandobjects.model.aggregation;

public class MotherBoard {
    private final String brand;
    private final String model;
    private final String socket;

    public MotherBoard(String brand, String model, String socket) {
        this.brand = brand;
        this.model = model;
        this.socket = socket;
    }

    public void print() {
        System.out.printf("%s %s, %s\n", brand, model, socket);
    }
}
