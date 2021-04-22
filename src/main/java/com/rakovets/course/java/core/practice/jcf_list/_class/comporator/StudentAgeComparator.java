package com.rakovets.course.java.core.practice.jcf_list._class.comporator;

import com.rakovets.course.java.core.practice.jcf_list._class.model.Student;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return ((Integer) o1.getAge()).compareTo(((Integer) o2.getAge()));
    }
}
