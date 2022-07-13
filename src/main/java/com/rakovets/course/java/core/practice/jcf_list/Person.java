package com.rakovets.course.java.core.practice.jcf_list;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final float averageAnnualMark;

    public Person(String name, String surname, int age, float averageAnnualMark) {
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

    public int getAge() {
        return age;
    }

    public float getAverageAnnualMark() {
        return averageAnnualMark;
    }
}
