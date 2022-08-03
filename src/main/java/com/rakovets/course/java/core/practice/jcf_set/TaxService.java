package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

public class TaxService {
    private SortedSet<Person> persons;
    private SortedSet<Fine> fines;

    public TaxService(SortedSet<Person> persons, SortedSet<Fine> fines) {
        this.persons = persons;
        this.fines = fines;
    }

    public Person getInfoPersonById(int personId) throws Exception {
        for (Person person : persons) {
            if (person.getId() == personId) {
                return person;
            }
        }
        throw new Exception();
    }

    public Set<Person> getInfoPersonByFineArticle(double articleId) throws Exception {
        Set<Person> personsWithFines = new HashSet<>();
        for (Fine fine : fines) {
            if (fine.getArticle() == articleId) {
                personsWithFines.add(getInfoPersonById(fine.getPersonId()));
            }
        }
        return personsWithFines;
    }

    public Set<Person> getInfoPersonByCity(String city) {
        Set<Person> personsLivesInCity = new HashSet<>();
        for (Person person : persons) {
            if (person.getCity() == city) {
                personsLivesInCity.add(person);
            }
        }
        return personsLivesInCity;
    }

    public Set<Fine> getInfoFinesByPersonId(int personId) {
        Set<Fine> finesByPersonId = new HashSet<>();
        for (Fine fine : fines) {
            if (fine.getPersonId() == personId) {
                finesByPersonId.add(fine);
            }
        }
        return finesByPersonId;
    }

    public Fine getInfoFineById(int fineId) throws Exception {
        for (Fine fine : fines) {
            if (fine.getFineId() == fineId) {
                return fine;
            }
        }
        throw new Exception();
    }

    public void deleteFine(Person human, Fine fineOfHuman) {
        for (Person person : persons) {
            if (person.getId() == human.getId()) {
                Iterator<Fine> iterator = fines.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().getFineId() == fineOfHuman.getFineId()) {
                        iterator.remove();
                        break;
                    }
                }
            }
        }
    }

    public void changeInformationAboutPerson(Person human, String replaceName, String replaceSurname,
                                             String replaceCity, int replaceId) {
        for (Person person : persons) {
            if (human == person) {
                human.setId(replaceId);
                human.setName(replaceName);
                human.setSurname(replaceSurname);
                human.setCity(replaceCity);
            }
        }
    }

    public SortedSet<Person> getPersons() {
        return persons;
    }

    public SortedSet<Fine> getFines() {
        return fines;
    }

    public Person getLastPerson() {
        return getPersons().last();
    }

    public Fine getLastFine() {
        return getFines().last();
    }

    @Override
    public String toString() {
        return "TaxService{" + "Persons =" + persons + '}';
    }
}
