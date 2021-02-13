package com.rakovets.course.java.core.practice.jcf.list.student;

import java.util.Comparator;
import java.util.List;

public class SchoolClass {
    private final List<Student> students;

    public SchoolClass(List<Student> students) {
        this.students = students;
    }

    public Student getBestStudent() {
        Comparator<Student> studentComparatorByAverageAnnualMark = new StudentComparatorByAverageAnnualMark();
        students.sort(studentComparatorByAverageAnnualMark);
        return students.get(0);
    }
}
