package com.rakovets.course.java.core.practice.jcf_list.students;

import java.util.Comparator;

public class StudentNameAndSurmameComparator implements Comparator<Student> {
    @Override
//Demo is not working, i don't now why
    public int compare(Student a, Student b) {
        return (a.getName() + b.getSurname()).compareTo(a.getName() + b.getSurname());
    }
}
