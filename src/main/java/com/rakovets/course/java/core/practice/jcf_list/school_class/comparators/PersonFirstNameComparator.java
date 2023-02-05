package com.rakovets.course.java.core.practice.jcf_list.school_class.comparators;

import com.rakovets.course.java.core.practice.jcf_list.school_class.Person;

import java.util.Comparator;

public class PersonFirstNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.getFirstName().compareTo(b.getFirstName());
    }
}
