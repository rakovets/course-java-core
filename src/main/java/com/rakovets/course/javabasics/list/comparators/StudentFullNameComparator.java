package com.rakovets.course.javabasics.list.comparators;

import com.rakovets.course.javabasics.list.Student;

import java.util.Comparator;

public class StudentFullNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = CharSequence.compare(o1.getName(), o2.getName());
        if (result == 0) {
            return CharSequence.compare(o1.getSurname(), o2.getSurname());
        }
        return result;
    }
}
