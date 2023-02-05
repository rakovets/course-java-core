package com.rakovets.course.java.core.practice.jcf_list.schoolclass.comparators;

import com.rakovets.course.java.core.practice.jcf_list.schoolclass.Person;
import java.util.Comparator;

public class StudentsFullNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person student1, Person student2) {
        int cmp = student1.getSurname().compareTo(student2.getSurname());
        if (cmp != 0) {
            return cmp;
        }
        return student1.getName().compareTo(student2.getName());
    }
}
