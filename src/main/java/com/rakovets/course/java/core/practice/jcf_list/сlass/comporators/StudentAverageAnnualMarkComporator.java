package com.rakovets.course.java.core.practice.jcf_list.сlass.comporators;

import com.rakovets.course.java.core.practice.jcf_list.сlass.Student;

import java.util.Comparator;

public class StudentAverageAnnualMarkComporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAverageAnnualMark(), o2.getAverageAnnualMark());
    }
}
