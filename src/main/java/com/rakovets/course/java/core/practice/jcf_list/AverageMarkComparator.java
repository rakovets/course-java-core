package com.rakovets.course.java.core.practice.jcf_list;

import java.util.Comparator;

public class AverageMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return ((Double) o1.getAverageAnnualMark()).compareTo((Double) o2.getAverageAnnualMark());
    }
}
