package com.rakovets.course.java.core.practice.lambda_expressions.University;

public class Student {
    private final String firstname;
    private final String lastname;
    private final String speciality;
    private final int course;

    public Student(String firstname, String lastname, String speciality, int course) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.speciality = speciality;
        this.course = course;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", speciality='" + speciality + '\'' +
                ", course=" + course +
                '}';
    }
}
