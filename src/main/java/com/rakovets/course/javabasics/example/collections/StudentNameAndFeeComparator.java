package com.rakovets.course.javabasics.example.collections;

import java.util.Comparator;

public class StudentNameAndFeeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        var result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            return Double.compare(o1.getFee(), o2.getFee());
        } else {
            return result;
        }
    }
}
