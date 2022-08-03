package com.rakovets.course.java.core.practice.jcf_set;

public class Person implements Comparable<Person> {
    private int id;
    private final int age;

    private String name;
    private String surname;
    private String city;

    public Person(String name, String surname, int age, String city, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
        this.id = id;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
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
        return id == person.id;
    }

    @Override
    public int compareTo(Person o) {
        return id - o.getId();
    }

    @Override
    public String toString() {
        return '\n' + "Person{" +
                "Name = '" + name + '\'' +
                ", Surname = '" + surname + '\'' +
                ", City = '" + city + '\'' +
                ", Age = " + age +
                ", id = " + id +
                '}';
    }
}
