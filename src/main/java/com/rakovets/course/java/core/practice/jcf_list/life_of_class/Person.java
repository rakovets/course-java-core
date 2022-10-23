package com.rakovets.course.java.core.practice.jcf_list.life_of_class;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final double averageAnnualMark;


    public Person(String name, String surname, int age, double averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }
    @Override
    public String toString(){
        return name + " " + surname + " " + age + " " + averageAnnualMark;
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

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }
}
