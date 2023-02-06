package com.rakovets.course.java.core.practice.jcf_set.tax_service;

import java.util.HashSet;
import java.util.Objects;

public class TaxService {
    private final HashSet<Person> personData;

    public TaxService() {
        this.personData = new HashSet<>();
    }

    public void addPerson(Person person) {
        personData.add(person);
    }

    public HashSet<Person> cityTaxes(String city) {
        HashSet<Person> cityTaxes = new HashSet<>();

        for (Person person : personData) {
            if (Objects.equals(person.getCity(), city)) {
                cityTaxes.add(person);
            }
        }

        return cityTaxes;
    }

    public void removeFine(Integer id) {
        for (Person person : this.personData) {
            for (Fine fine : person.getFines()) {
                if (id == fine.getHashCode()) {
                    person.removeFine(id);
                }
            }
        }
    }

    public HashSet<Person> getPersonData() {
        return personData;
    }
}
