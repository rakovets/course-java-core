package com.rakovets.course.java.core.practice.jcf.list.project_class.comparator;

import com.rakovets.course.java.core.practice.jcf.list.project_class.Student;

import java.util.Comparator;

public class StudentComparatorByFullName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int flag = o1.getSurname().compareToIgnoreCase(o2.getSurname());
        if (flag == 0) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        } else
            return flag;
    }

}
