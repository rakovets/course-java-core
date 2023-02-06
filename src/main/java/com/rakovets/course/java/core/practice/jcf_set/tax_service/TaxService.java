package com.rakovets.course.java.core.practice.jcf_set.tax_service;

import java.util.TreeSet;

public class TaxService {
    private TreeSet<Person> personData;

    private void addPerson(Person person) {
        personData.add(person);
    }

    public TreeSet<Person> getPersonData() {
        return personData;
    }
}
