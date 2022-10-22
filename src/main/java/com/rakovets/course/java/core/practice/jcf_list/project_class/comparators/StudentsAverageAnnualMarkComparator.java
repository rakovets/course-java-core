package com.rakovets.course.java.core.practice.jcf_list.project_class.comparators;

import com.rakovets.course.java.core.practice.jcf_list.project_class.models.Person;

import java.util.Comparator;

public class StudentsAverageAnnualMarkComparator implements Comparator<Person> {
    @Override
    public int compare (Person student1, Person student2) {
        return Double.compare(student1.getAverageAnnualMark(), student2.getAverageAnnualMark());
    }
}
