package com.rakovets.course.java.core.practice.jcf_list.school.comparators_class;

import com.rakovets.course.java.core.practice.jcf_list.school.classroom.Person;

import java.util.Comparator;

public class FullNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int sortByFirstName = o1.getName().compareTo(o2.getName());
        return sortByFirstName != 0 ? sortByFirstName : o1.getSurname().compareTo(o2.getSurname());
    }
}
