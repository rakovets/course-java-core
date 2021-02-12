package com.rakovets.course.java.core.practice.jcf.list;

import java.util.Comparator;

public class StudentCompareByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
