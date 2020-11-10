package com.rakovets.course.javabasics.example.collections.list.comparators;

import com.rakovets.course.javabasics.example.collections.list.Student;

import java.util.Comparator;

public class StudentAverageMarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = Double.compare(o1.getAverageAnnualMark(), o2.getAverageAnnualMark());
        return result;
    }
}
