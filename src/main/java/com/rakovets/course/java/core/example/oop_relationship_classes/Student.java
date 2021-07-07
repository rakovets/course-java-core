package com.rakovets.course.java.core.example.oop_relationship_classes;


/**
 * Класс {@link Student} НЕ ИМЕЕТ ЗАВИСИМОСТЕЙ от других классов
 */
public class Student {
    private final String name;
    private final int iq;

    public Student(String name, int iq) {
        this.name = name;
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public int getIq() {
        return iq;
    }
}
