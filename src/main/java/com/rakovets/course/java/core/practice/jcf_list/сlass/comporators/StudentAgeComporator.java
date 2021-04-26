package com.rakovets.course.java.core.practice.jcf_list.сlass.comporators;

import com.rakovets.course.java.core.practice.jcf_list.сlass.Student;

import java.util.Comparator;

public class StudentAgeComporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
