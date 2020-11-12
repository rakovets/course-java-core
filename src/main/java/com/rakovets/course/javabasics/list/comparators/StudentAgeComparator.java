package com.rakovets.course.javabasics.list.comparators;

import com.rakovets.course.javabasics.list.Student;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator <Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = Integer.compare(o1.getAge(), o2.getAge());
        return result;
    }
}
