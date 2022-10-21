package com.rakovets.course.java.core.practice.jcf_list.comparator;

import com.rakovets.course.java.core.practice.jcf_list.project_class.Person;

import java.util.Comparator;

public class PersonAverageAnnualMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Double.compare(person1.getAverageAnnualMark(), person2.getAverageAnnualMark());
    }
}
