package com.rakovets.course.javabasics.practice.lambdaexpressions.university;

public class Student {
    private String name;
    private String surname;
    private String specialty;
    private String yearOfStudy;
    public Student (String name, String surname, String specialty, String yearOfStudy) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return this.name.equals(student.name) && this.surname.equals(student.surname) &&
                this.specialty.equals(student.specialty) && this.yearOfStudy.equals(student.yearOfStudy);
    }

    @Override
    public String toString() {
        return name + " " + surname + " specialty: " + specialty + ", year of study: " + yearOfStudy;
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}
