package com.rakovets.course.java.core.practice.jcf_list.school.comparator;

import com.rakovets.course.java.core.practice.jcf_list.school.Person;

import java.util.Comparator;

public class CompareByFullName implements Comparator<Person> {
    @Override
    public int compare(Person student1, Person student2) {
        int result = student1.getName().compareTo(student2.getName());
        if (result == 0) {
            result = student1.getSurname().compareTo(student2.getSurname());
        }
        return result;
    }
}
