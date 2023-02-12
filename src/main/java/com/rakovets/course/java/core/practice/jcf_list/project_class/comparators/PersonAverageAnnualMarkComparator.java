package com.rakovets.course.java.core.practice.jcf_list.project_class.comparators;

import com.rakovets.course.java.core.practice.jcf_list.project_class.Person;

import java.util.Comparator;

public class PersonAverageAnnualMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person person, Person comparablePerson) {
        return person.getAverageAnnualMark().compareTo(comparablePerson.getAverageAnnualMark());
    }
}
