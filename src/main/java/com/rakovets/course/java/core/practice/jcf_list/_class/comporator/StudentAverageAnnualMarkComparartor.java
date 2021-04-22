package com.rakovets.course.java.core.practice.jcf_list._class.comporator;

import com.rakovets.course.java.core.practice.jcf_list._class.model.Student;

import java.util.Comparator;

public class StudentAverageAnnualMarkComparartor implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return ((Double) o1.getAverageAnnualMark()).compareTo(((Double) o2.getAverageAnnualMark()));
    }
}
