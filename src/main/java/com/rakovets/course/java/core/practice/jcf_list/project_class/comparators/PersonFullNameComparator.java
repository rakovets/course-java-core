package com.rakovets.course.java.core.practice.jcf_list.project_class.comparators;

import com.rakovets.course.java.core.practice.jcf_list.project_class.Person;

import java.util.Comparator;

public class PersonFullNameComparator implements Comparator<Person> {
    public int compare(Person person, Person comparablePerson) {
        int nameResult = person.getName().compareTo(comparablePerson.getName());
        if (nameResult == 0) {
            return person.getSurname().compareTo(comparablePerson.getSurname());
        }
        return nameResult;
    }
}
