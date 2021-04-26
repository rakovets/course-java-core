package com.rakovets.course.java.core.practice.jcf_list.cclass.comparator;

import com.rakovets.course.java.core.practice.jcf_list.cclass.Student;

import java.util.Comparator;

public class StudentFullNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getName() + o1.getSurname()).compareToIgnoreCase(o2.getName() + o2.getSurname());
    }
}
