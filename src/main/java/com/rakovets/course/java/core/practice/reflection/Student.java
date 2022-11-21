package com.rakovets.course.java.core.practice.reflection;

public class Student {
    private final String name;
    private final String surname;
    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    private int updateAge(int years) {
        age += years;
        return this.age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", surname=" + surname +
                ", age='" + age + '\'' +
                '}';
    }
}
