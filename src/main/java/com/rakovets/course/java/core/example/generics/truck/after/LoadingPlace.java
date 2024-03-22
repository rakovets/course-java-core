package com.rakovets.course.java.core.example.generics.truck.after;

public class LoadingPlace {
    void uploadCargo(Truck truck, Box[] boxes) {
        for (int i = 0; i < boxes.length; i++) {
            truck.loadBox(boxes[i], i);
            System.out.printf("%s upload on %d position.\n", boxes[i], i);
        }
    }
}
