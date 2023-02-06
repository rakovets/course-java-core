package com.rakovets.course.java.core.practice.jcf_list.schoolclass.comparators;

import com.rakovets.course.java.core.practice.jcf_list.schoolclass.Person;
import java.util.Comparator;

public class StudentsAverageAnnualMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person student1, Person student2) {
        return student2.getAverageAnnualMark().compareTo(student1.getAverageAnnualMark());
    }
}
