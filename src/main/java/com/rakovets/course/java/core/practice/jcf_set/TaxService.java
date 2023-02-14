package com.rakovets.course.java.core.practice.jcf_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaxService {
    Set<Person> persons = new LinkedHashSet<>();

    public boolean addToBase(Person personToAdd) {
        if (persons.contains(personToAdd)) {
            System.out.println("Such person is already exists!");
            return false;
        }
        for (Person person : persons) {
            if (person.getPersonID().equals(personToAdd.getPersonID())) {
                System.out.println("You are trying to add person with the same ID!");
                return false;
            }
        }
        persons.add(personToAdd);
        System.out.println("Successfully added");
        return true;
    }

    public boolean showInfoUsingID(int ID) {
        for (Person person : persons) {
            if (person.getPersonID().equals(String.valueOf(ID))) {
                System.out.println(person);
                return true;
            }
        }
        System.out.println("There is no person with such ID, please correct and try again!");
        return false;
    }

    public void showInfoUsingPenalties(Penalty penalty) {
        for (Person person : persons) {
            if (person.personPenalties.contains(penalty)) {
                System.out.println(person);
            }
        }
    }

    public void showInfoUsingCity(String city) {
        for (Person person : persons) {
            if (person.getLivingCity().equals(city)) {
                System.out.println(person);
            }
        }
    }

    public void showAllInfo() {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
