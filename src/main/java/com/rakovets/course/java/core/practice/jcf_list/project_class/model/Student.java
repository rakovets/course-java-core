package com.rakovets.course.java.core.practice.jcf_list.project_class.model;

public class Student {
    private String name;
    private String surName;
    private int age;
    private double averageAnnualMark;

    public Student(String name, String surName, int age, double averageAnnualMark) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAverageAnnualMark(double averageAnnualMark) {
        this.averageAnnualMark = averageAnnualMark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surName + '\'' +
                ", age=" + age +
                ", averageAnnualMark=" + averageAnnualMark +
                '}';
    }
}
