package com.rakovets.course.java.core.practice.jcf_list.schoolClass;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double averageAnnualMark;

    public Student(String name, String surname, int age, double averageAnnualMark) {
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

    public int getAge() {
        return age;
    }

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }
}
