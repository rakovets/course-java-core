package com.rakovets.course.java.core.practice.jcf_set;

public class Person implements Comparable<Person>{
    private final int personId;
    private String firstName;
    private String lastName;
    private String city;

    public Person(int personId, String firstName, String lastName, String city) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public int getPersonId() {
        return personId;
    }

    public String getCity() {
        return city;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return personId - o.getPersonId();
    }
}
