package com.rakovets.course.java.core.practice.jcf_list.project_class;

import java.util.Comparator;

public class ComparatorStudentSurname implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        if (first == second) {
            return 0;
        } else {
            return Integer.compare(first.getSurname().compareTo(second.getSurname()), 0);
        }
    }
}
