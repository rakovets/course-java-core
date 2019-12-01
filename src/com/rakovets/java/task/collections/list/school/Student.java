package com.rakovets.java.task.collections.list.school;

public class Student {
    private String name;
    private String surname;
    private Integer age;
    private Integer averageAnnualMark;

    public Student(String name, String surname, Integer age, Integer averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
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

    public Integer getAverageAnnualMark() {
        return averageAnnualMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageAnnualMark=" + averageAnnualMark +
                '}';
    }
}


