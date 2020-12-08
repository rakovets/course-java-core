package com.rakovets.course.javabasics.practice.reflection.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Human {
    private String name;
    private int age;
    private Gender gender;

    public Human(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private String isAdult(Integer age) {
        if (age >= 18) {
            return "yes";
        } else {
            return "no";
        }
    }
}
