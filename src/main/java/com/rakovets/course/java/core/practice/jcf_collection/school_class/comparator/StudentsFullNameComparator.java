package com.rakovets.course.java.core.practice.jcf_collection.school_class.comparator;

import com.rakovets.course.java.core.practice.jcf_collection.school_class.Person;

import java.util.Comparator;

public class StudentsFullNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person stud1, Person stud2) {
        int result = stud1.getName().compareTo(stud2.getName());
        if (result == 0) {
            result = stud1.getSurname().compareTo(stud2.getSurname());
        }
        return result;
    }
}
