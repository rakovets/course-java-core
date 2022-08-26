package com.rakovets.course.java.core.practice.jcf_set;

public class Citizen implements Comparable<Citizen> {
    private final int id;
    private final int yearOfBirth;
    private String firstName;
    private String lastName;
    private String locationCity;

    public Citizen(String firstName, String lastName, String locationCity, int yearOfBirth, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.locationCity = locationCity;
        this.yearOfBirth = yearOfBirth;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citizen citizen = (Citizen) o;
        return id == citizen.id;
    }

    @Override
    public int compareTo(Citizen o) {
        return id - o.getId();
    }

    @Override
    public String toString() {
        return '\n' + "Citizen{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", locationCity='" + locationCity + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", id=" + id +
                '}';
    }
}
