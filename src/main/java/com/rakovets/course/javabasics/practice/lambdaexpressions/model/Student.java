package com.rakovets.course.javabasics.practice.lambdaexpressions.model;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String specialty;
    private int course;

    public Student(int id, String name, String surname, String specialty, int course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
    }

    @Override
    public String toString() {
        return id + "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
