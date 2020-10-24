package com.rakovets.course.javabasics.example.collections;

public class Student {
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
}
