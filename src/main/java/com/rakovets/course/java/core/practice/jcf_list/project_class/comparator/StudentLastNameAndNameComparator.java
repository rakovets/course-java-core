package com.rakovets.course.java.core.practice.jcf_list.project_class.comparator;

import com.rakovets.course.java.core.practice.jcf_list.project_class.model.Student;

import java.util.Comparator;

public class StudentLastNameAndNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        var result = o1.getSurName().compareTo(o2.getSurName());
        if (result == 0) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return result;
        }
    }
}
