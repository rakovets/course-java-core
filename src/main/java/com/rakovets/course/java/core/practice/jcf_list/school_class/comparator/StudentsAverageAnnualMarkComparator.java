package com.rakovets.course.java.core.practice.jcf_list.school_class.comparator;

import com.rakovets.course.java.core.practice.jcf_list.school_class.Person;

import java.util.Comparator;

public class StudentsAverageAnnualMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person stud1, Person stud2) {
        return Double.compare(stud1.getAverageAnnualMark(), stud2.getAverageAnnualMark());
    }
}
