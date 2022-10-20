package com.rakovets.course.java.core.practice.jcf_list.school.comparator;

import com.rakovets.course.java.core.practice.jcf_list.school.Person;

import java.util.Comparator;

public class CompareByAverageMark implements Comparator<Person> {
    @Override
    public int compare(Person student1, Person student2) {
        return Double.compare(student1.getAverageAnnualMark(), student2.getAverageAnnualMark());
    }
}
