package com.rakovets.course.java.core.example.jcf.comparator;

import jcf_list.Student;

import java.util.Comparator;

public class StudentNameAndSurnameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        var result = o1.getName().compareTo(o2.getName());
        if (result == 0)
            return o1.getSurname().compareTo(o2.getSurname());
        else
            return result;
    }
}

