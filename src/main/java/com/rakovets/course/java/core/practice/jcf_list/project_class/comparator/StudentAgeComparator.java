package com.rakovets.course.java.core.practice.jcf_list.project_class.comparator;

import com.rakovets.course.java.core.practice.jcf_list.project_class.model.Student;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getAge(),o1.getAge());
    }
}
