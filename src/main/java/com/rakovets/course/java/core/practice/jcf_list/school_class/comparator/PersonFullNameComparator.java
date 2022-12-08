package com.rakovets.course.java.core.practice.jcf_list.school_class.comparator;

import com.rakovets.course.java.core.practice.jcf_list.school_class.Person;

import java.util.Comparator;

public class PersonFullNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName()) == 0 ?
                a.getSurname().compareTo(b.getSurname()) : a.getName().compareTo(b.getName());
    }
}
