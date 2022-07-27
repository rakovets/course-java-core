package com.rakovets.course.java.core.practice.jcf_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String town;
    private int id;
    private int totalFine;
    private final List<Fine> fines;

    public Person(String name, String surname, int id, String town, Fine fine) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.town = town;
        this.fines = new ArrayList<>(Collections.singletonList(fine));
        this.totalFine = fine.getAmountTheFine();
    }

    /**
     * Calculate the new amount of the fine.
     *
     * @param fine another penalty.
     */
    public void totalFine(Fine fine) {
        totalFine = getTotalFine() + fine.getAmountTheFine();

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getTown() {
        return town;
    }

    public List<Fine> getFines() {
        return fines;
    }

    public int getTotalFine() {
        return totalFine;
    }

    public void setTotalFine(int totalFine) {
        this.totalFine = totalFine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTown(String town) {
        this.town = town;
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
        return id == person.id && totalFine == person.totalFine && name.equals(person.name)
                && surname.equals(person.surname) && town.equals(person.town) && fines.equals(person.fines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, town, id, totalFine, fines);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", town='" + town + '\'' +
                ", id=" + id +
                ", totalFine=" + totalFine +
                ", fines=" + fines +
                '}';
    }
}
