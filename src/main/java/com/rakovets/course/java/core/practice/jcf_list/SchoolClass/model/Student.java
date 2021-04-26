package com.rakovets.course.java.core.practice.jcf_list.SchoolClass.model;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double averageAnnualMark;

    public Student(String name, String surname, int age, double averageAnnualMark){
        this.age = age;
        this.surname = surname;
        this.name = name;
        this.averageAnnualMark = averageAnnualMark;
    }

    public String getName() {
        return name;
    }

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + averageAnnualMark + " " + age;
    }
}
