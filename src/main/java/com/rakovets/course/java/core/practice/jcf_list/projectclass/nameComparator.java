package com.rakovets.course.java.core.practice.jcf_list.projectclass;

import java.util.Comparator;

public class nameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
