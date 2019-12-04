package com.rakovets.java.practice.collections;

public class Student implements Comparable {
    private String name;
    private double cash;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, double cash) {
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cash=" + cash +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return Double.compare(this.getCash(), student.getCash());
    }
}
