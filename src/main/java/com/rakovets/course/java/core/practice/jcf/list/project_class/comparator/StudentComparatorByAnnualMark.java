package com.rakovets.course.java.core.practice.jcf.list.project_class.comparator;

import com.rakovets.course.java.core.practice.jcf.list.project_class.Student;

import java.util.Comparator;

public class StudentComparatorByAnnualMark implements Comparator <Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1 == o2) {
            return 0;
        } else if (o1.getAverageAnnualMark() > o2.getAverageAnnualMark()) {
            return -1;
        } else if (o1.getAverageAnnualMark() < o2.getAverageAnnualMark()) {
            return 1;
        } else {
            return 0;
        }
    }
}
