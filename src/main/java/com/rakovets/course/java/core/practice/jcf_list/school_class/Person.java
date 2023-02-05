package com.rakovets.course.java.core.practice.jcf_list.school_class;

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

    public Person() {
        this.firstName = null;
        this.surname = null;
        this.age = 0;
        this.averageAnnualMark = 0.0;
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
