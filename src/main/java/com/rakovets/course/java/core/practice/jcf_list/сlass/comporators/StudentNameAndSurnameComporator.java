package com.rakovets.course.java.core.practice.jcf_list.сlass.comporators;

import com.rakovets.course.java.core.practice.jcf_list.сlass.Student;

import java.util.Comparator;

public class StudentNameAndSurnameComporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        var result = o1.getSurname().compareTo(o2.getSurname());
        if (result == 0) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return result;
        }
    }
}
