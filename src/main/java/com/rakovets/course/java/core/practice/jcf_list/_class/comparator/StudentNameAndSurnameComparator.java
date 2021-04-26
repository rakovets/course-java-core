package com.rakovets.course.java.core.practice.jcf_list._class.comparator;

import com.rakovets.course.java.core.practice.jcf_list._class.Student;

import java.util.Comparator;

public class StudentNameAndSurnameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        var result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            return o1.getSurname().compareTo(o2.getSurname());
        } else {
            return result;
        }
    }
}
