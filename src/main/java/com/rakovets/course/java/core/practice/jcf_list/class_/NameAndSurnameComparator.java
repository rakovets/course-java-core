package com.rakovets.course.java.core.practice.jcf_list.class_;

import java.util.Comparator;

public class NameAndSurnameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int compareByName = o1.getName().compareTo(o2.getName());
        return compareByName != 0 ? compareByName : o1.getSurname().compareTo(o2.getSurname());
    }
}
