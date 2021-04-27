package com.rakovets.course.java.core.practice.jcf_list.students;

import java.util.Comparator;

public class StudentAverageAnnualMarkComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return Double.compare(a.getAverageAnnualMark(), b.getAverageAnnualMark());
    }
}
