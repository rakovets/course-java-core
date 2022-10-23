package com.rakovets.course.java.core.practice.jcf_list.Class.Comparators;

import com.rakovets.course.java.core.practice.jcf_list.Class.Models.Person;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person student1, Person student2) {
        return Integer.compare(student1.getAge(), student2.getAge());
    }
}
