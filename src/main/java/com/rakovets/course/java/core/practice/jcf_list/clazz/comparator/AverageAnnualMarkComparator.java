package com.rakovets.course.java.core.practice.jcf_list.clazz.comparator;

import com.rakovets.course.java.core.practice.jcf_list.clazz.Person;

import java.util.Comparator;

/**
 * Comparator by average annual mark.
 */
public class AverageAnnualMarkComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Double.compare(o1.getAverageAnnualMark(), o2.getAverageAnnualMark());
    }
}
