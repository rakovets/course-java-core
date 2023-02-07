package com.rakovets.course.java.core.practice.jcf_set.tax_service;

import java.util.HashSet;
import java.util.Objects;

public class TaxService {
    private final HashSet<Person> personData;

    public TaxService() {
        personData = new HashSet<>();
    }

    public void addPerson(Person person) {
        personData.add(person);
    }

    public void removePerson(Person person) {
        personData.removeIf(personToRemove -> Objects.equals(personToRemove, person));
    }

    public Fine showFineById(String id) {
        Fine fineToShow = new Fine();

        for (Person person : personData) {
            for (Fine fine : person.getFines()) {
                if(Objects.equals(fine.getId(), id)) {
                    fineToShow = fine;
                }
            }
        }

        return fineToShow;
    }

    public HashSet<Fine> showFinesByType(Enum<Fines> type) {
        HashSet<Fine> fineHashSet = new HashSet<>();

        for (Person person : personData) {
            for (Fine fine : person.getFines()) {
                if(Objects.equals(fine.getType(), type)) {
                    fineHashSet.add(fine);
                }
            }
        }

        return fineHashSet;
    }

    public HashSet<Fine> showFinesByCity(Cities city) {
        HashSet<Fine> fineHashSet = new HashSet<>();

        for (Person person : personData) {
            for (Fine fine : person.getFines()) {
                if(Objects.equals(person.getCity(), city)) {
                    fineHashSet.add(fine);
                }
            }
        }

        return fineHashSet;
    }

    public HashSet<Fine> showAllFines() {
        HashSet<Fine> fineHashSet = new HashSet<>();

        for (Person person : personData) {
            fineHashSet.addAll(person.getFines());
        }

        return fineHashSet;
    }

    public void personInfoRenew(Person person, String name, String lastName, Cities city) {
        for (Person personToRenew : this.personData) {
            if(personToRenew == person) {
                person.setName(name);
                person.setLastName(lastName);
                person.setCity(city);
            }
        }
    }

    public void fineInfoRenew(String id, Fines type, Integer sum, String fineDetails) {
        for (Person person : this.personData) {
            for (Fine fine : person.getFines()) {
                if (Objects.equals(fine.getId(), id)) {
                    fine.setType(type);
                    fine.setSum(sum);
                    fine.setFineDetails(fineDetails);
                }
            }
        }
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

