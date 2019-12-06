package com.rakovets.course.util.school;

import java.util.Comparator;

public class AverageMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getAverageAnnualMark() > student2.getAverageAnnualMark()) {
            return 1;
        } else if (student1.getAverageAnnualMark() < student2.getAverageAnnualMark()) {
            return -1;
        } else {
            return 0;
        }
    }
}
