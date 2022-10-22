package com.rakovets.course.java.core.practice.jcf_list.project_class.comparators;

import com.rakovets.course.java.core.practice.jcf_list.project_class.models.Person;

import java.util.Comparator;

public class StudentsAgeComparator implements Comparator<Person> {
    @Override
    public int compare (Person student1, Person student2) {
        return Double.compare(student1.getAge(), student2.getAge());
    }
}
