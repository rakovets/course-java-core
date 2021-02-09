package com.rakovets.course.java.core.practice.jcf.list.school;

public class Student implements Comparable<Student> {
    private String name;
    private String lastName;
    private int age;
    private double averageAnnualMark;

    public Student(String name, String lastName, int age, double averageAnnualMark) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getAverageAnnualMark() == o.getAverageAnnualMark()) {
            return 0;
        } else if (this.getAverageAnnualMark() > o.getAverageAnnualMark()) {
            return 1;
        } else if (this.getAverageAnnualMark() < o.getAverageAnnualMark()) {
            return -1;
        } return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", averageAnnualMark=" + averageAnnualMark +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }

    public void setAverageAnnualMark(double averageAnnualMark) {
        this.averageAnnualMark = averageAnnualMark;
    }
}
