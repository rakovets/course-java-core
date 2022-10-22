package com.rakovets.course.java.core.practice.jcf_list.project_class.comparators;

import com.rakovets.course.java.core.practice.jcf_list.project_class.models.Person;

import java.util.Comparator;

public class StudentsNameAndSurnameComparator implements Comparator<Person> {
    @Override
    public int compare (Person student1, Person student2) {
        int resultOfComparing = student1.getName().compareTo(student2.getName());
        if (resultOfComparing == 0) {
            resultOfComparing = student1.getSurname().compareTo(student2.getSurname());
        }
        return resultOfComparing;
    }
}
