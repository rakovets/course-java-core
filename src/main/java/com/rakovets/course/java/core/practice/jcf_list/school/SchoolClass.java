package com.rakovets.course.java.core.practice.jcf_list.school;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.studio.FeeComparator;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    List<Person> students;
    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    public Person getBestStudent(List<Person> students) {
        List<Person> sortedStudentsByMark = new ArrayList<>(students);
        sortedStudentsByMark.sort(new AverageAnnualMarkComparator());
        return sortedStudentsByMark.get(students.size() - 1);
    }
}
