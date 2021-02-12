package com.rakovets.course.java.core.practice.jcf.list;

import java.util.Comparator;

public class StudentCompareBySurname implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
