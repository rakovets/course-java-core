package com.rakovets.course.java.core.practice.jcf_list;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getName() + o1.getSurname()).compareToIgnoreCase(o2.getName() + o2.getSurname());
    }
}
