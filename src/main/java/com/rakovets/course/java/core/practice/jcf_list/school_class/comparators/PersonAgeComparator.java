package com.rakovets.course.java.core.practice.jcf_list.school_class.comparators;

import com.rakovets.course.java.core.practice.jcf_list.school_class.Person;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        int result = 0;
        if (a.getAge() > b.getAge()) {
            result = 1;
        } else if (a.getAge() < b.getAge()) {
            result = -1;
        }
        return result;
    }
}
