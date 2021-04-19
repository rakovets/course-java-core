package com.rakovets.course.java.core.example.oop_classes_and_objects.model.composition;

public class PC {
    private final String codeName;
    private final CPU cpu;
    private final MotherBoard motherBoard;

    public PC(String codeName, CPU cpu, MotherBoard motherBoard) {
        this.codeName = codeName;
        this.cpu = cpu;
        this.motherBoard = motherBoard;
    }

    public void print() {
        System.out.printf("%s:\n", codeName);
        motherBoard.print();
        cpu.print();
    }
}
