package com.rakovets.course.java.core.practice.jcf_list.school_class.comparator;

import com.rakovets.course.java.core.practice.jcf_list.school_class.Person;

import java.util.Comparator;

public class PersonFullNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        int result = a.getName().compareTo(b.getName());
        if (result == 0) {
            return a.getSurname().compareTo(b.getSurname());
        } else {
            return result;
        }
    }
}
