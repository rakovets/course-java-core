package com.rakovets.course.java.core.practice.jcf_list.school_class;

import com.rakovets.course.java.core.practice.jcf_list.school_class.comparator.PersonAverageMarkComparator;

import java.util.List;

public class SchoolClass {
    private List<Person> students;

    public Person getBestStudent(List<Person> students) {
        students.sort(new PersonAverageMarkComparator());
        return students.get(0);
    }
}
