package com.rakovets.course.javabasics.example.jcf.comparator;

import com.rakovets.course.javabasics.example.jcf.model.Student;

import java.util.Comparator;

public class StudentFeeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getFee(), o2.getFee());
    }
}
