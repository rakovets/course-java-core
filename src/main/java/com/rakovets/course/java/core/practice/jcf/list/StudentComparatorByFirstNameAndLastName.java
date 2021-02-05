package com.rakovets.course.java.core.practice.jcf.list;

import java.util.Comparator;

public class StudentComparatorByFirstNameAndLastName implements Comparator <Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1 == o2) {
            return 0;
        } else if (o1.getName().equals(o2.getName())) {
           return o1.getSurname().compareTo(o2.getSurname());
        } else {
           return o1.getName().compareTo(o2.getName());
        }
    }
}
