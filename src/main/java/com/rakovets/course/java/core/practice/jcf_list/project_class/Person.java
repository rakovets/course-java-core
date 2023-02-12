package com.rakovets.course.java.core.practice.jcf_list.project_class;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final Integer age;
    private final Double averageAnnualMark;

    public Person(String name, String surname, Integer age, Double averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Double getAverageAnnualMark() {
        return averageAnnualMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name)
                && Objects.equals(surname, person.surname)
                && Objects.equals(age, person.age)
                && Objects.equals(averageAnnualMark, person.averageAnnualMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, averageAnnualMark);
    }
}
