package com.rakovets.course.java.core.practice.jcf_collection.school_class.comparator;

import com.rakovets.course.java.core.practice.jcf_collection.school_class.Person;

import java.util.Comparator;

public class StudentsAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person stud1, Person stud2) {
        return Integer.compare(stud1.getAge(), stud2.getAge());
    }
}
