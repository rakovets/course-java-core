package com.rakovets.course.javabasics.practice.reflection.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Student {
    private String name;
    private String surname;
    private LocalDate birthday;
    private int age;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        age = (int) ChronoUnit.YEARS.between(birthday, LocalDate.now());
    }

    public int getAge() {
        return age;
    }
}
