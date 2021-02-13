package com.rakovets.course.java.core.practice.jcf.list.student;

import java.util.Comparator;

public class StudentComparatorByAverageAnnualMark implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1 == o2) {
            return 0;
        } else return Double.compare(o2.getAverageAnnualMark(), o1.getAverageAnnualMark());
    }
}
