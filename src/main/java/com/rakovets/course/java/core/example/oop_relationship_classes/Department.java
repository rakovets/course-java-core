package com.rakovets.course.java.core.example.oop_relationship_classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс {@link Department} ИМЕЕТ АГРЕГАЦИЮ (AGGREGATION) с классом {@link Professor}, так как:
 * <ul>
 *  <li>класс {@link Department} ИМЕЕТ ЗАВИСИМОСТЬ (DEPENDENCY) от класса {@link Professor}</li>
 *  <li>класс {@link Department} ИМЕЕТ АССОЦИАЦИЮ (ASSOCIATION) с классом {@link Professor}</li>
 *  <li>класс {@link Department} состоит из объектов класса {@link Professor}, т.е. в любой момент может воспользоваться методами и полями объектов этого класса</li>
 * </ul>
 */
public class Department {
    private final String title;
    private final List<Professor> professors = new ArrayList<>();

    public Department(String title) {
        this.title = title;
    }

    public boolean hireProfessor(Professor newProfessor) {
        return professors.add(newProfessor);
    }

    public void printStuff() {
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }
    }

    public String getTitle() {
        return title;
    }
}
