package com.rakovets.course.java.core.practice.jcf_list.Class.comparator;

import com.rakovets.course.java.core.practice.jcf_list.Class.model.Student;
import java.util.Comparator;

public class StudentComparatorForNameAndUsername implements Comparator<Student> {
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
