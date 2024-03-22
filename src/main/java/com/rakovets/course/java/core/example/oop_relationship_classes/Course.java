package com.rakovets.course.java.core.example.oop_relationship_classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс {@link Course} НЕ ИМЕЕТ ЗАВИСИМОСТЕЙ от других классов (за исключением {@link List} и {@link ArrayList})
 */
public class Course {
    private String name;
    private final List<String> themes = new ArrayList<>();

    public List<String> getAllThemes() {
        return themes;
    }

    public boolean addNewTheme(String theme) {
        return themes.add(theme);
    }
}
