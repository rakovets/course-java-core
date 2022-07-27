package com.rakovets.course.java.core.practice.jcf_set;

import java.util.Set;
import java.util.SortedSet;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;

public class TaxService {
    private final SortedSet<Person> personDataBase;
    private final SortedSet<Fine> fineDataBase;

    public TaxService(SortedSet<Person> personDataBase, SortedSet<Fine> fineDataBase) {
        this.personDataBase = personDataBase;
        this.fineDataBase = fineDataBase;
    }

    public Set<Person> getPersonById(int personId) {
        Set<Person> persons = new HashSet<>();
        for (Person person : personDataBase) {
            if (person.getPersonId() == personId) {
                persons.add(person);
            }
        }
        return persons;
    }

    public Set<Person> getPersonByCity(String city) {
        Set<Person> persons = new HashSet<>();
        for (Person person : personDataBase) {
            if (person.getCity().equals(city)) {
                persons.add(person);
            }
        }
        return persons;
    }

    public Set<Fine> getFineByType(String fineType) {
        Set<Fine> fines = new HashSet<>();
        for (Fine fine : fineDataBase) {
            if (fine.getFineType().equals(fineType)) {
                fines.add(fine);
            }
        }
        return fines;
    }

    public Person getLastAddedPerson() {
        Comparator<Person> compareById = Person::compareTo;
        SortedSet<Person> persons = new TreeSet<>(compareById);
        persons.addAll(personDataBase);
        return persons.last();
    }

    public Set<Fine> getPersonNewFines(int personId) {
        Set<Fine> fines = new HashSet<>();
        for (Fine fine : fineDataBase) {
            if (fine.getRelatedPersonId() == personId && !fine.isPaid()) {
                fines.add(fine);
            }
        }
        return fines;
    }

    public void deleteFineFromDatabaseById(int fineId) {
        Iterator<Fine> fineIterator = fineDataBase.iterator();
        while (fineIterator.hasNext()) {
            if (fineIterator.next().getFineId() == fineId) {
                fineIterator.remove();
                break;
            }
        }
    }

    public void changePersonInformation(int personId, String fistName, String lastName, String city) {
        for (Person person : personDataBase) {
            if (person.getPersonId() == personId) {
                person.setFirstName(fistName);
                person.setLastName(lastName);
                person.setCity(city);
            }
        }
    }

    public void changePersonFineInformation(int fineId, String fineType, boolean isPaid) {
        for (Fine fine : fineDataBase) {
            if (fine.getFineId() == fineId) {
                fine.setFineType(fineType);
                fine.setIsPaid(isPaid);
            }
        }
    }

    public SortedSet<Fine> getFineDataBase() {
        return fineDataBase;
    }

    public SortedSet<Person> getPersonDataBase() {
        return personDataBase;
    }

    @Override
    public String toString() {
        return "TaxService{" + "personDataBase=" + personDataBase + '}';
    }
}
