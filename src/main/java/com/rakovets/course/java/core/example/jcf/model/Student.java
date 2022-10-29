package com.rakovets.course.java.core.example.jcf.model;

public class Student implements Comparable<Student> {
    private final String name;
    private double fee;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, double fee) {
        this.name = name;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cash=" + fee +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.getFee(), o.getFee());
    }
}
