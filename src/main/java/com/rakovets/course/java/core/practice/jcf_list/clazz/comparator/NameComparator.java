package com.rakovets.course.java.core.practice.jcf_list.clazz.comparator;

import com.rakovets.course.java.core.practice.jcf_list.clazz.Person;

import java.util.Comparator;

/**
 * Comparator by name.
 */
public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
