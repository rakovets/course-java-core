package com.rakovets.course.java.core.practice.jcf_list.school;

public class Person {
    private String name;
    private String surname;
    private int age;
    private double averageAnnualMark;
    public Person(String name, String surname, int age, double averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + averageAnnualMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.averageAnnualMark, averageAnnualMark) == 0 && name.equals(person.name) && surname.equals(person.surname);
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
