package com.rakovets.course.java.core.practice.jcf.list.student;

import java.util.Comparator;

public class StudentsComparatorByFullName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1 == o2) {
            return 0;
        } else if (!o1.getName().equals(o2.getName())) {
            return -1;
        }
        return 0;
    }
}
