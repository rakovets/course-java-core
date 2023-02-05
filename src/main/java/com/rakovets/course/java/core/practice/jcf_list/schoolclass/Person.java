package com.rakovets.course.java.core.practice.jcf_list.schoolclass;

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

    public Person() {
        this.name = "Name";
        this.surname = "Surname";
        this.age = 0;
        this.averageAnnualMark = 0.0;
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
}
