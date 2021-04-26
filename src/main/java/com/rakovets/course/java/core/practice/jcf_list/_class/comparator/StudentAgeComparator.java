package com.rakovets.course.java.core.practice.jcf_list._class.comparator;

import com.rakovets.course.java.core.practice.jcf_list._class.Student;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAge(), o2.getAge());
    }
}
