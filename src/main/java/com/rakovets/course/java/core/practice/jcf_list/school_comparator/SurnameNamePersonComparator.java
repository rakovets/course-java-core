package com.rakovets.course.java.core.practice.jcf_list.school_comparator;

import com.rakovets.course.java.core.practice.jcf_list.Person;

import java.util.Comparator;

public class SurnameNamePersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (!p1.getSurname().equals(p2.getSurname())) {
            return p1.getSurname().compareTo(p2.getSurname());
        }
        return p1.getName().compareTo(p2.getName());
    }
}
