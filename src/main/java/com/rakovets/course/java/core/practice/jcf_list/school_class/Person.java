package com.rakovets.course.java.core.practice.jcf_list.school_class;

public class Person {
    private String firstName;
    private String surname;
    private int age;
    private int averageAnnualMark;

    public Person(String firstName, String lastName, int age, int averageAnnualMark) {
        this.firstName = firstName;
        this.surname = lastName;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAverageAnnualMark() {
        return averageAnnualMark;
    }

    public void setAverageAnnualMark(int averageAnnualMark) {
        this.averageAnnualMark = averageAnnualMark;
    }
}
