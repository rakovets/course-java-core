package com.rakovets.course.java.core.practice.jcf_list.school.comparators_class;

import com.rakovets.course.java.core.practice.jcf_list.school.classroom.Person;

import java.util.Comparator;

public class AverageAnnualMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Double.compare(o1.getAverageAnnualMark(), o2.getAverageAnnualMark());
    }
}
