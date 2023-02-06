package com.rakovets.course.java.core.practice.jcf_list.Class;

import java.util.Comparator;

public class StudentFullNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        var results = o1.getSurname().compareTo(o2.getSurname());
        if (results == 0) {
            return results = o1.getName().compareTo(o2.getSurname());
        }
        return results;
    }
}
