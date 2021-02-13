package com.rakovets.course.java.core.practice.jcf.list.student;

import java.util.Comparator;

public class StudentComparatorByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1 == o2) {
            return 0;
        } else return Integer.compare(o2.getAge(), o1.getAge());
    }
}
