package com.rakovets.course.java.core.practice.jcf_list.Class.comparator;

import com.rakovets.course.java.core.practice.jcf_list.Class.model.Student;
import java.util.Comparator;

public class StudentComparatorForAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
