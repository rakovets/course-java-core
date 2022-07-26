package com.rakovets.course.java.core.practice.jcf_list.school_comparator;

import com.rakovets.course.java.core.practice.jcf_list.Person;

import java.util.Comparator;

public class AverageAnnualMarkPersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Float.compare(p1.getAverageAnnualMark(), p2.getAverageAnnualMark());
    }
}
