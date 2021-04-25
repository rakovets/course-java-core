package com.rakovets.course.java.core.practice.jcf_list.schoolClass;

import java.util.Comparator;

public class StudentSurnameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
