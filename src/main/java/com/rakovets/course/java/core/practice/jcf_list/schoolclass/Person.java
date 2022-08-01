package com.rakovets.course.java.core.practice.jcf_list.schoolclass;

public class Person {
    private String name;
    private String surname;
    private  int age;
    private double averageAnnualMark;

    public Person (String name, String surname, int age, double averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    public int getAge () {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }
}
