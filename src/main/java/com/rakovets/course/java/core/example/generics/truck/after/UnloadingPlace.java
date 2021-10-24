package com.rakovets.course.java.core.example.generics.truck.after;

import com.rakovets.course.java.core.example.generics.truck.model.Laptop;

public class UnloadingPlace<T extends Laptop> {
    void unload(Truck<T> truck) {
        for (int i = 0; i < truck.size; i++) {
            Laptop laptop = (Laptop) truck.unloadBox(i).unboxing();
            System.out.println(laptop.getModel());
        }
    }
}
