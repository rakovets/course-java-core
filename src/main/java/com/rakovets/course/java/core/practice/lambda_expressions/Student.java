package com.rakovets.course.java.core.practice.lambda_expressions;

public class Student {
    private String name;
    private String surname;
    private String spec;
    private int course;

    public Student(String name, String surname, String spec, int course) {
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpec() {
        return spec;
    }

    public int getCourse() {
        return course;
    }
}
