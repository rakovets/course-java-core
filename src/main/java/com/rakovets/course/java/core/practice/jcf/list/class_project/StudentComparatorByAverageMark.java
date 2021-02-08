package com.rakovets.course.java.core.practice.jcf.list.class_project;

import java.util.Comparator;

public class StudentComparatorByAverageMark implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        if (first == second) {
            return 0;
        } else {
            return Double.compare(first.getAverageAnnualMark(), second.getAverageAnnualMark());
        }
    }
}
