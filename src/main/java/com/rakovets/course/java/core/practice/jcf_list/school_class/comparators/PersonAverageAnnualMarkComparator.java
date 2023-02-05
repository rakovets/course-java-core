package com.rakovets.course.java.core.practice.jcf_list.school_class.comparators;

import com.rakovets.course.java.core.practice.jcf_list.school_class.Person;

import java.util.Comparator;

public class PersonAverageAnnualMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        int result = 0;
        if (a.getAverageAnnualMark() > b.getAverageAnnualMark()) {
            result = 1;
        } else if (a.getAverageAnnualMark() < b.getAverageAnnualMark()) {
            result = -1;
        }
        return result;
    }
}
