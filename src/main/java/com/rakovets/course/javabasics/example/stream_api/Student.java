package com.rakovets.course.javabasics.example.stream_api;

public class Student {
    private String name;
    private Speciality futureProfession;
    private int course;

    public Student(String name, Speciality speciality, int course) {
        this.name = name;
        this.futureProfession = speciality;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Speciality getFutureProfession() {
        return futureProfession;
    }

    public void setFutureProfession(Speciality futureProfession) {
        this.futureProfession = futureProfession;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (this.futureProfession == student.futureProfession && this.course == student.course) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return this.futureProfession.hashCode() * 3 + course * 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", futureProfession=" + futureProfession +
                ", course=" + course +
                '}';
    }
}
