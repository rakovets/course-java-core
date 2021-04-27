package com.rakovets.course.java.core.practice.jcf_list.project_class.comparator;

import com.rakovets.course.java.core.practice.jcf_list.project_class.model.Student;

import java.util.Comparator;

public class StudentNameAndSurnameComparator implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return (first.getName() + first.getSurname()).compareToIgnoreCase(second.getName() + second.getSurname());
    }
}
