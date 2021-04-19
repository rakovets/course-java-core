package com.rakovets.course.java.core.example.oop_classes_and_objects;

import com.rakovets.course.java.core.example.oop_classes_and_objects.model.composition.CPU;
import com.rakovets.course.java.core.example.oop_classes_and_objects.model.composition.MotherBoard;
import com.rakovets.course.java.core.example.oop_classes_and_objects.model.composition.PC;

public class Example6Composition {
    public static void main(String[] args) {
        PC dev = new PC("Dev",
                new CPU("Intel", "i5 6400", "LGA 1151"),
                new MotherBoard("ASUS", "Z-170P", "LGA 1151"));
        dev.print();
    }
}
