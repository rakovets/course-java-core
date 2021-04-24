package com.rakovets.course.java.core.example.jcf.comparator;

import jcf_list.Student;

import java.util.Comparator;

public class StudentAverageAnnualMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAverageAnnualMark(), o2.getAverageAnnualMark());
    }
}


