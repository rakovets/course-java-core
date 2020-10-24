package com.rakovets.course.javabasics.example.collections;

import java.util.Comparator;

public class StudentFeeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getFee(), o2.getFee());
    }
}
