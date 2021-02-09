package com.rakovets.course.java.core.practice.jcf.list.school;

import java.util.Comparator;

public class CompareByLastName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
