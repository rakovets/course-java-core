package com.rakovets.course.java.core.practice.jcf_set.tax_service;

import java.util.HashSet;
import java.util.Objects;

public class TaxService {
    private HashSet<Person> personData;

    public TaxService() {
        personData = new HashSet<>();
    }

    public void addPerson(Person person) {
        personData.add(person);
    }

    public void removePerson(Person person) {
        personData.removeIf(personToRemove -> Objects.equals(personToRemove, person));
    }

    public boolean addFine(Person person, Fines type, Integer sum, String fineDetails) {
        boolean isDone = false;

        for (Person value : getPersonData()) {
            if (value == person) {
                person.addFine(type, sum, fineDetails);
                isDone = true;
            }
        }

        return isDone;
    }

    public boolean removeFine(String id) {
        boolean isDone = false;

        for (Person person : this.getPersonData()) {
            for (Fine fine : person.getFines()) {
                if (Objects.equals(fine.getId(), id)) {
                    person.removeFine(id);
                    isDone = true;
                }
            }
        }

        return isDone;
    }

    public HashSet<Person> getPersonData() {
        return personData;
    }
}

