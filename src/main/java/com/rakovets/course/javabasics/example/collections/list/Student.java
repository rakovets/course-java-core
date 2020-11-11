package com.rakovets.course.javabasics.example.collections.list;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double averageAnnualMark;


    public Student(String name, String surname, int age, double averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark =averageAnnualMark;
    }

    @Override

    public String toString() {
        return "Student Name is " + name
                + ", Surname " + surname
                + ", Aaverage mark " + averageAnnualMark
                + ", Age " + age + "\n";
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
