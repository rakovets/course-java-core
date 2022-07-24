package com.rakovets.course.java.core.practice.jcf_list.clazz;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final double averageAnnualMark;

    /**
     * Constructor.
     *
     * @param name              student's name.
     * @param surname           last name of the student.
     * @param age               student's age.
     * @param averageAnnualMark average student score.
     */
    public Person(String name, String surname, int age, double averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Double.compare(person.averageAnnualMark, averageAnnualMark)
                == 0 && name.equals(person.name) && surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, averageAnnualMark);
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return getName() + " " + getSurname();
    }

    public int getAge() {
        return age;
    }

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }
}
