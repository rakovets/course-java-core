package com.rakovets.course.java.core.practice.jcf.list.school;

import java.util.Comparator;

public class CompareByAverageMark implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverageAnnualMark() == o2.getAverageAnnualMark()) {
            return 0;
        } else if (o1.getAverageAnnualMark() < o2.getAverageAnnualMark()) {
            return -1;
        } else if (o1.getAverageAnnualMark() > o2.getAverageAnnualMark()) {
            return 1;
        } return 0;
    }
}
