package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class TaxService implements Printable {
    Set<Person> data;

    public TaxService(int capacity) {
        data = new LinkedHashSet<>(capacity);
    }

    /**
     * Searches the database for information by user ID.
     *
     * @param id person code.
     * @return Information about this user.
     */
    public Person getInfoById(int id) {
        Person person = null;
        for (Person datum : data) {
            if (datum.getId() == id) {
                person = datum;
            }
        }
        return person;
    }

    /**
     * Searches the database for a person by penalty type.
     *
     * @param fine type of penalty.
     * @return all persons with this penalty.
     */
    public Set<Person> getInfoByFine(Fine fine) {
        Set<Person> people = new HashSet<>();
        for (Person person : data) {
            List<Fine> fines = person.getFines();
            for (Fine penalty : fines) {
                if (penalty == fine) {
                    people.add(person);
                }
            }
        }
        return people;
    }

    /**
     * Looking for a person in the city.
     *
     * @param city city to search.
     * @return all persons from a given city.
     */
    public Set<Person> getInfoByCity(String city) {
        Set<Person> people = new LinkedHashSet<>();
        for (Person person : data) {
            if (Objects.equals(person.getTown(), city)) {
                people.add(person);
            }
        }
        return people;
    }

    /**
     * Displays information about the new user.
     *
     * @return new user information.
     */
    public Person getNewPerson() {
        Object[] array = data.toArray();
        return (Person) array[array.length - 1];
    }

    /**
     * Adding a penalty to a person.
     *
     * @param human the person to whom the penalty is to be added.
     * @param fine  new fine.
     */
    public Person getNewFine(Person human, Fine fine) {
        Person newInformationPerson = null;
        for (Person person : data) {
            List<Fine> fines = person.getFines();
            if (person == human) {
                fines.add(fine);
                human.totalFine(fine);
                newInformationPerson = person;
            }
        }
        return newInformationPerson;
    }

    /**
     * Removing a fine from the user.
     *
     * @param human from whom we sting a fine.
     * @param fine  which one.
     */
    public Person penaltyRemoval(Person human, Fine fine) {
        Person newInformationPerson = null;
        for (Person person : data) {
            if (person == human) {
                List<Fine> fines = person.getFines();
                for (Fine penalty : fines) {
                    if (penalty == fine) {
                        fines.remove(fine);
                        person.setTotalFine(person.getTotalFine() - fine.getAmountTheFine());
                        newInformationPerson = person;
                        break;
                    }
                }
            }
        }
        return newInformationPerson;
    }

    /**
     * Change the user's personal data.
     *
     * @param person  for whom the change is taking place.
     * @param id      new id.
     * @param name    new name.
     * @param surname new surname.
     * @param town    new town.
     * @return new information about the person.
     */
    public Person changeInfoByPerson(Person person, int id, String name, String surname, String town) {
        Person newPerson = null;
        for (Person datum : data) {
            if (person == datum) {
                person.setId(id);
                person.setName(name);
                person.setSurname(surname);
                person.setTown(town);
                newPerson = person;
            }
        }
        return newPerson;
    }

    /**
     * Changes the old penalty to the new one.
     *
     * @param person  which we change the penalty.
     * @param fine    old fine.
     * @param newFine new fine.
     * @return new information about the person.
     */
    public Person changeFine(Person person, Fine fine, Fine newFine) {
        Person newPerson = null;
        for (Person datum : data) {
            if (person == datum) {
                List<Fine> fines = person.getFines();
                for (Fine penalty : fines) {
                    if (penalty == fine) {
                        fines.remove(fine);
                        fines.add(newFine);
                        datum.setTotalFine(newFine.getAmountTheFine());
                        newPerson = datum;
                    }
                }
            }
        }
        return newPerson;
    }
}
