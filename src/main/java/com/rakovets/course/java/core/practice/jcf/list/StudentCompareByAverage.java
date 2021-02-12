package com.rakovets.course.java.core.practice.jcf.list;

import java.util.Comparator;

public class StudentCompareByAverage implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverageAnnualMark() < o2.getAverageAnnualMark()) {
            return 1;
        } else if (o1.getAverageAnnualMark() > o2.getAverageAnnualMark()) {
            return -1;
        } else {
            return 0;
        }
    }
}
