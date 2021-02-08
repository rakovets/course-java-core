package com.rakovets.course.java.core.practice.jcf.list.class_project;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int age;
    private double averageAnnualMark;

    public Student(String name, String surname, int age, double averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        if (age >= 5) {
            this.age = age;
        }
        if (averageAnnualMark >= 0) {
            this.averageAnnualMark = averageAnnualMark;
        }
    }

    @Override
    public int compareTo(Student student) {
        if (this.averageAnnualMark == student.getAverageAnnualMark()) {
            return 0;
        } else if (this.averageAnnualMark > student.averageAnnualMark) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Student: " + name + " " + surname + ", age: " + age + ", averageAnnualMark: " + averageAnnualMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (age >= 5) {
            this.age = age;
        }
    }

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }

    public void setAverageAnnualMark(double averageAnnualMark) {
        if (averageAnnualMark >= 0) {
            this.averageAnnualMark = averageAnnualMark;
        }
    }
}
