package com.rakovets.course.java.core.practice.jcf_list.students;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}
