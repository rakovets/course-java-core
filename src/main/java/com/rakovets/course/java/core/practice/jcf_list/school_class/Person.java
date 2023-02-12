package com.rakovets.course.java.core.practice.jcf_list.school_class;

import java.util.Objects;

public class Person {
    private final String firstName;
    private final String surname;
    private final Integer age;
    private final Double averageAnnualMark;

    public Person(String firstName, String surname, Integer age, Double averageAnnualMark) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(surname, person.surname)
                && Objects.equals(age, person.age)
                && Objects.equals(averageAnnualMark, person.averageAnnualMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname, age, averageAnnualMark);
    }

    public String getFirstName() {
        return firstName;
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
}
