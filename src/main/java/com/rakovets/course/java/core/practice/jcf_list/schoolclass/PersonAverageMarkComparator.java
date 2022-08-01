package com.rakovets.course.java.core.practice.jcf_list.schoolclass;

import java.util.Comparator;

public class PersonAverageMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Double.compare(person1.getAverageAnnualMark(), person2.getAverageAnnualMark());
    }
}
