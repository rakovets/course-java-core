package com.rakovets.course.java.core.practice.jcf_list.clazz.comparator;

import com.rakovets.course.java.core.practice.jcf_list.clazz.Person;

import java.util.Comparator;

/**
 * Comparator by age.
 */
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
