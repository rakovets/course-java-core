package com.rakovets.course.java.core.practice.jcf_list;

import java.util.Comparator;

public class StudentAverageAnnualMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAverageAnnualMark(), o2.getAverageAnnualMark());
    }
}
