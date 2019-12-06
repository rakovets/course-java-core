package com.rakovets.course.util.school;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getAge() > student2.getAge()) {
            return 1;
        } else if (student1.getAge() < student2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
