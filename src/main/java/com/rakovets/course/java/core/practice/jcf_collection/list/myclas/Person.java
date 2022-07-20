package com.rakovets.course.java.core.practice.jcf_collection.list.myclas;

public class Person {
    private String name;
    private String surname;
    private Integer age;
    private Double averageAnnualMark;

    public Person(String name, String surname, Integer age, Double averageAnnualMark) {
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

    public Double getAverageAnnualMark() {
        return averageAnnualMark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAverageAnnualMark(Double averageAnnualMark) {
        this.averageAnnualMark = averageAnnualMark;
    }
}
