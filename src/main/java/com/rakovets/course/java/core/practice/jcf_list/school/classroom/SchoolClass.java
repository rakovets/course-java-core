package com.rakovets.course.java.core.practice.jcf_list.school.classroom;

import com.rakovets.course.java.core.practice.jcf_list.school.comparators_class.AverageAnnualMarkComparator;

import java.util.List;

public class SchoolClass {
    private List<Person> students;

    public Person getBestStudent(List<Person> students) {
        students.sort(new AverageAnnualMarkComparator());
        return students.get(students.size() - 1);
    }
}
