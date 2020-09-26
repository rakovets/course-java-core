package com.rakovets.course.javabasics.example.lambda;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o, Student t1) {
        return o.getAge() - t1.getAge();
    }
}
