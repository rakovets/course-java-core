package com.rakovets.course.java.core.practice.jcf_list.class_project;

import java.util.Comparator;

public class StudentAverageAnnualMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person s1, Person s2) {
        return Double.compare(s1.getAverageAnnualMark(), s2.getAverageAnnualMark());
    }
}
