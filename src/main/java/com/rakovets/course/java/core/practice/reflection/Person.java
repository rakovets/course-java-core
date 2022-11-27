package com.rakovets.course.java.core.practice.reflection;

public class Person {
    private String name;
    private String surname;
    private String sex;
    private int age;

    public Person (String name, String surname, String sex, int age) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public int getAge() {
        return age;
    }

    public void addAge(int plusToAge) {
        age += plusToAge;
    }

    public int getRestPeriodInYearsToRetire() {
        int restToRetire = 0;
        switch (sex.charAt(0)) {
            case 'm':
                restToRetire = 65 - age;
                break;
            case 'w':
                restToRetire = 60 - age;
                break;
        }
        return restToRetire;
    }

    public int multiple (int x, int y) {
        return x * y;
    }

    public int sum (int x, int y) {
        return x + y;
    }

    public int multiple (int x) {
        return x * x;
    }

    public void setData (String name, String surname, String sex, int age) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", возраст " + age + " лет, " + sex + ".";
    }
}
