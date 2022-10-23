package com.rakovets.course.java.core.practice.jcf_list.life_of_class;

import com.rakovets.course.java.core.practice.jcf_list.comparatot_for_class.AverageAnnualMarkComparator;

import java.util.Comparator;
import java.util.List;

public class SchoolClass {
    private final List<Person> students;

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    public String getBestStudent(List<Person> students) {
        Comparator<Person> comparator = new AverageAnnualMarkComparator();
        students.sort(comparator);
        return students.get(0).toString();
    }
}
