package com.rakovets.course.java.core.practice.jcf_list.school;

import java.util.Comparator;

public class AverageMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Double.compare(person1.getAverageAnnualMark(), person2.getAverageAnnualMark());
    }
}
