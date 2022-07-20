package com.rakovets.course.java.core.practice.jcf_collection.list.myclas;

import java.util.Comparator;

public class SortFirstNameAndLastName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().equals(o2.getName())) {
            return o1.getSurname().compareTo(o2.getSurname());
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
