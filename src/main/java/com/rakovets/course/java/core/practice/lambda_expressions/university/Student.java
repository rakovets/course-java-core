package com.rakovets.course.java.core.practice.lambda_expressions.university;

public class Student {
    private final String name;
    private final String surname;
    private final String speciality;
    private int yearOfStudy;

    public Student(String name, String surname, String speciality, int yearOfStudy) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", speciality: '" + speciality + '\'' + ", year: " + yearOfStudy;
    }
}
