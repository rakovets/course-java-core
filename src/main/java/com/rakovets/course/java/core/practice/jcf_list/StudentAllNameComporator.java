package com.rakovets.course.java.core.practice.jcf_list;

import java.util.Comparator;

public class StudentAllNameComporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            result = o1.getSurname().compareTo(o2.getSurname());
        }
        return result;
    }
}
