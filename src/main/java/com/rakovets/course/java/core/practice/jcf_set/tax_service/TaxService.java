package com.rakovets.course.java.core.practice.jcf_set.tax_service;

import java.util.HashSet;

public class TaxService {
    private HashSet<Person> personData;

    public TaxService() {
        this.personData = new HashSet<>();
    }

    public void addPerson(Person person) {
        personData.add(person);
    }

    public HashSet<Person> getPersonData() {
        return personData;
    }
}
