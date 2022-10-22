package com.rakovets.course.java.core.practice.jcf_list.school;

import java.util.Objects;

public class Person {
    String name;
    String surname;
    int age;
    double averageAnnualMark;

    public Person(String name, String surname, int age, double averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageAnnualMark=" + averageAnnualMark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.averageAnnualMark, averageAnnualMark) == 0 && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, averageAnnualMark);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }

    public void setAverageAnnualMark(double averageAnnualMark) {
        this.averageAnnualMark = averageAnnualMark;
    }
}
