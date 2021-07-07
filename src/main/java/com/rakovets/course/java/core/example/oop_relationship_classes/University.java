package com.rakovets.course.java.core.example.oop_relationship_classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс {@link University} ИМЕЕТ КОМПОЗИЦИЮ (COMPOSITION) с классом {@link Department}, так как:
 * <ul>
 *  <li>класс {@link University} ИМЕЕТ ЗАВИСИМОСТЬ (DEPENDENCY) от класса {@link Department}</li>
 *  <li>класс {@link University} ИМЕЕТ АССОЦИАЦИЮ (ASSOCIATION) с классом {@link Department}</li>
 *  <li>класс {@link University} ИМЕЕТ АГРЕГАЦИЮ (AGGREGATION) с классом {@link Department}</li>
 *  <li>класс {@link University} состоит из объектов класса {@link Department}, которые создаются ТОЛЬКО в рамках текущего объекта класса {@link University} и никто другой не может получить ссылку на эти объекты</li>
 * </ul>
 */
public class University {
    private String title;
    private final List<Department> departments;

    public University(String title) {
        departments = new ArrayList<>();
        departments.add(new Department("Mathematics"));
        departments.add(new Department("Philosophy"));
        departments.add(new Department("Physics"));
    }

    public void printDepartments() {
        for (Department department : departments) {
            System.out.println(department.getTitle());
        }
    }
}
