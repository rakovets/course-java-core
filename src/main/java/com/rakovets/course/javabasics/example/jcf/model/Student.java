package com.rakovets.course.javabasics.example.jcf.model;

public class Student implements Comparable {
    private String name;
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
    public int compareTo(Object o) {
        Student student = (Student) o;
        return Double.compare(this.getFee(), student.getFee());
    }
}
