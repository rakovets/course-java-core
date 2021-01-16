package com.rakovets.course.java.core.example.oop.classesandobjects;

import com.rakovets.course.java.core.example.oop.classesandobjects.model.aggregation.CPU;
import com.rakovets.course.java.core.example.oop.classesandobjects.model.aggregation.MotherBoard;
import com.rakovets.course.java.core.example.oop.classesandobjects.model.aggregation.PC;

public class Example6Composition {
    public static void main(String[] args) {
        PC dev = new PC("Dev",
                new CPU("Intel", "i5 6400", "LGA 1151"),
                new MotherBoard("ASUS", "Z-170P", "LGA 1151"));
        dev.print();
    }
}
