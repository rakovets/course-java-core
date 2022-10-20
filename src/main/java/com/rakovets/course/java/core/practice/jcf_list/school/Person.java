package com.rakovets.course.java.core.practice.jcf_list.school;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final double averageAnnualMark;

    public Person(String name, String surname, int age, double averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Person pers = (Person) o;
        return averageAnnualMark == pers.averageAnnualMark && age == pers.age && Objects.equals(name, pers.name) && Objects.equals(surname, pers.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, averageAnnualMark, age);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }
}
