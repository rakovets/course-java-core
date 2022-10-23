package com.rakovets.course.java.core.practice.jcf_list.school_class.comparator;

import com.rakovets.course.java.core.practice.jcf_list.school_class.Person;

import java.util.Comparator;

public class PersonAverageMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return Double.compare(b.getAverageAnnualMark(), a.getAverageAnnualMark());
    }
}
