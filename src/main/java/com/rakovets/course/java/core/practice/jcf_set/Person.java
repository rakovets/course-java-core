package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.enum_set.CityEnum;
import com.rakovets.course.java.core.practice.jcf_set.enum_set.FineTypeEnum;

import java.util.HashSet;
import java.util.Objects;

public class Person {
    private final HashSet<Fine> finesDB;
    private String nameSurnamePerson;
    private int personalIdCode;
    private CityEnum city;

    public Person(HashSet<Fine> finesDB, String nameSurnamePerson, int personalIdeCode, CityEnum city) {
        this.finesDB = finesDB;
        this.nameSurnamePerson = nameSurnamePerson;
        this.personalIdCode = personalIdeCode;
        this.city = city;
    }

    /**
     * Updating taxpayer information
     *
     * @param city
     * @return
     */
    public boolean updatePersonInformation(int personalIdCode, CityEnum city, HashSet<Person> peopleDB) {
        boolean isUpdated = false;
        for (Person p : peopleDB) {
            if (p.getPersonalIdCode() == personalIdCode) {
                p.setNameSurnamePerson(nameSurnamePerson);
                p.setCity(city);
                isUpdated = true;
                break;
            }
        }
        return isUpdated;
    }

    /**
     * Updating information on taxpayer fines
     *
     * @param idFine
     * @param typeFine
     * @param sumFine
     * @return
     */
    public boolean updateFineInformation(int idFine, FineTypeEnum typeFine, double sumFine, HashSet<Person> peopleDB) {
        boolean isUpdated = false;
        for (Person p : peopleDB) {
            for (Fine fine : p.getFinesDB()) {
                if (fine.getIdFine() == idFine) {
                    fine.setTypeFine(typeFine);
                    fine.setSumFine(sumFine);
                    isUpdated = true;
                    break;
                }
            }
            if (isUpdated) {
                break;
            }
        }
        return isUpdated;
    }

    /**
     * Adding a new fine for an existing Person
     *
     * @param fine
     * @param peopleDB
     */
    public void addNewFineForExistPerson(Fine fine, HashSet<Person> peopleDB) {
        for (Person p : peopleDB) {
            if (p.getPersonalIdCode() == personalIdCode) {
                finesDB.add(fine);
            }
        }
    }

    /**
     * Removing fine
     *
     * @param idFine
     * @param peopleDB
     */
    public void deleteFineFromDatabaseById(int idFine, HashSet<Person> peopleDB) {
        peopleDB.forEach(person -> {
            person.getFinesDB()
                    .removeIf(fine -> fine.getIdFine() == idFine);
        });
    }

    @Override
    public String toString() {
        return "Person{" +
                "finesDB=" + finesDB +
                ", nameSurnamePerson='" + nameSurnamePerson + '\'' +
                ", personalIdeCode=" + personalIdCode +
                ", city=" + city +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personalIdCode == person.personalIdCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalIdCode);
    }

    public int getPersonalIdCode() {
        return personalIdCode;
    }

    public void setPersonalIdeCode(int personalIdeCode) {
        this.personalIdCode = personalIdeCode;
    }

    public CityEnum getCity() {
        return city;
    }

    public HashSet<Fine> getFinesDB() {
        return finesDB;
    }

    public void setCity(CityEnum city) {
        this.city = city;
    }

    public String getNameSurnamePerson() {
        return nameSurnamePerson;
    }

    public void setNameSurnamePerson(String nameSurnamePerson) {
        this.nameSurnamePerson = nameSurnamePerson;
    }
}
