package com.rakovets.course.java.core.practice.lambda_expressions;

public class Student {
    private String name;
    private String surname;
    private Specialty specialty;
    private int currentSemester;

    public Student(String name, String surname, Specialty specialty, int currentSemester) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.currentSemester = currentSemester;
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

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialty=" + specialty +
                ", currentSemester=" + currentSemester +
                '}';
    }
}
