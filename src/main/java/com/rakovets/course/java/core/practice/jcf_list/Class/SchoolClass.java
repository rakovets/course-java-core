package com.rakovets.course.java.core.practice.jcf_list.Class;

import java.util.LinkedList;

public class SchoolClass {
    LinkedList<Person> students = new LinkedList<>();

    public SchoolClass (LinkedList<Person> students) {
        for(Person x: students) {
            this.students.add(x);
        }
    }

    public Person getBestStudent(LinkedList<Person> students) {
        students.sort(new StudentAnnualMarkComparator());
        return students.getLast();
    }
}
