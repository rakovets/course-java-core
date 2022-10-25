package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.enum_set.CityEnum;
import com.rakovets.course.java.core.practice.jcf_set.enum_set.FineTypeEnum;

import java.util.*;

public class TaxService {
    private final HashSet<Person> peopleDB;

    public TaxService(HashSet<Person> peopleDB) {
        this.peopleDB = peopleDB;
    }

    /**
     * adding a new Person
     *
     * @param person
     * @throws Exception
     */
    public void addNewPerson(Person person) throws Exception {
        if (peopleDB.contains(person)) {
            throw new Exception("Person with id already exist: " + person.getPersonalIdCode());
        }
        peopleDB.add(person);
    }

    /**
     * Show all information for TaxService
     *
     * @return
     */
    public HashSet<Person> showAll() {
        HashSet<Person> result = null;
        for (Person p : peopleDB) {
            result = peopleDB;
        }
        return result;
    }

    /**
     * Show data by typeFine
     *
     * @param typeFine
     * @return fines
     */
    public HashSet<Fine> getFinesByType(FineTypeEnum typeFine) {
        HashSet<Fine> fines = new HashSet<>();
        for (Person p : peopleDB) {
            for (Fine f : p.getFinesDB()) {
                if (f.getTypeFine() == typeFine) {
                    fines.add(f);
                }
            }
        }
        return fines;
    }

    /**
     * Show data by personalIdCod
     *
     * @param personalIdCode
     * @return result
     */
    public Person getPersonById(int personalIdCode) {
        Person result = null;
        for (Person p : peopleDB) {
            if (p.getPersonalIdCode() == personalIdCode) {
                result = p;
            }
        }
        return result;
    }

    /**
     * Show data by City
     *
     * @param city
     * @return
     */
    public Set<Person> getPersonByCity(CityEnum city) {
        Set<Person> persons = new HashSet<>();
        for (Person p : peopleDB) {
            if (p.getCity().equals(city)) {
                persons.add(p);
            }
        }
        return persons;
    }
}
