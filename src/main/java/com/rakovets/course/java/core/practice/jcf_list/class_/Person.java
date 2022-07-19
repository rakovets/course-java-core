package com.rakovets.course.java.core.practice.jcf_list.class_;

public class Person {
    private String name;
    private String surname;
    private int age;
    private double averageAnnualMark;

    public Person(String name, String surname, int age, double averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + " " + surname + '\'' +
                ", averageAnnualMark=" + averageAnnualMark +
                ", age=" + age +
                '}';
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
