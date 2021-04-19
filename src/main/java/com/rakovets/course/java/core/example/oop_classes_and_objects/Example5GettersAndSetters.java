package com.rakovets.course.java.core.example.oop_classes_and_objects;

import com.rakovets.course.java.core.example.oop_classes_and_objects.model.Car;

public class Example5GettersAndSetters {
    public static void main(String[] args) {
        Car bmw = new Car("X7", 2019);
        System.out.printf("Car model: %s.\n", bmw.getModel());
        System.out.printf("Car year: %d.\n", bmw.getYear());
    }
}
