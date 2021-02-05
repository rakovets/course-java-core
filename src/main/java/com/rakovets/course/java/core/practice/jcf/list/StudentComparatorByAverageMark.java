package com.rakovets.course.java.core.practice.jcf.list;

import java.util.Comparator;

public class StudentComparatorByAverageMark implements Comparator <Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1 == o2) {
            return 0;
        } else return Double.compare(o1.getAge(), o2.getAge());
    }
}
