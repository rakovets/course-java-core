package com.rakovets.course.java.core.practice.jcf_list._class;

public class Student {
    private final String name;
    private final String surname;
    private final int age;
    private final double averageAnnualMark;

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

    @Override
    public String toString() {
        return "\nName - " + getName() + ",\tSurname - " + getSurname() + ",\tAge - " + getAge() + ",\tAverageAnnualMark - " + getAverageAnnualMark();
    }
}
