package com.rakovets.course.java.core.practice.jcf_list.school_class;

public class Person {
    private final String firstName;
    private final String surname;
    private final Integer age;
    private final Integer averageAnnualMark;

    public Person(String firstName, String lastName, Integer age, Integer averageAnnualMark) {
        this.firstName = firstName;
        this.surname = lastName;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    public Person() {
        this.firstName = null;
        this.surname = null;
        this.age = 0;
        this.averageAnnualMark = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getAverageAnnualMark() {
        return averageAnnualMark;
    }
}
