package com.rakovets.course.java.core.example.oop_relationship_classes;


import java.util.List;

/**
 * Класс {@link Professor} ИМЕЕТ ЗАВИСИМОСТЬ (DEPENDENCY) от класса {@link Course}, так как:
 * <ul>
 *  <li>изменение сигнатуры метода, возвращаемого типа или поля в классе {@link Course} приведет к тому, что необходимо изменить класс {@link Professor}</li>
 * </ul>
 * Класс {@link Professor} ИМЕЕТ АССОЦИАЦИЮ (ASSOCIATION) с классом {@link Student}, так как:
 * <ul>
 *  <li>класс {@link Professor} ИМЕЕТ ЗАВИСИМОСТЬ (DEPENDENCY) от класса {@link Student}</li>
 *  <li>класс {@link Professor} знает о объекте класса {@link Student}, т.е. в любой момент может воспользоваться методами и полями объекта этого класса</li>
 * </ul>
 */
public class Professor {
    private String name;
    private Student bestStudent;

    public void research(Course course) {
        List<String> themes = course.getAllThemes();
        for (String theme : themes) {
            System.out.println(theme);
        }
    }

    public void updateCourse(Course course, String newTheme) {
        boolean added = course.addNewTheme(newTheme);
        if (added) {
            System.out.println("Added!");
        } else {
            System.out.println("Didn't add!");
        }
    }

    public void exam(Student student) {
        if (bestStudent == null || bestStudent.getIq() < student.getIq()) {
            bestStudent = student;
        }
    }

    public void giveAsExample() {
        if (bestStudent != null) {
            System.out.println("Best student: " + bestStudent.getName());
        }
    }

    public String getName() {
        return name;
    }
}
