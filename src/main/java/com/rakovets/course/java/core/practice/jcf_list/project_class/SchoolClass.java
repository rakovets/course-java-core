package com.rakovets.course.java.core.practice.jcf_list.project_class;

import com.rakovets.course.java.core.practice.jcf_list.project_class.comparators.PersonAverageAnnualMarkComparator;

import java.util.Collections;
import java.util.List;

public class SchoolClass {
    private List<Person> students;

    public SchoolClass() {
    }

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    public Person getBestStudent(List<Person> students) {
        students.sort(new PersonAverageAnnualMarkComparator());
        Collections.reverse(students);
        return students.get(0);
    }
}
