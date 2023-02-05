package com.rakovets.course.java.core.practice.jcf_list.schoolclass;

import java.util.Iterator;
import java.util.List;

public class SchoolClass {
    private final List<Person> students;

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    public Person getBestStudent(List<Person> students) {
        Person bestStudent = new Person();
        Iterator<Person> studentIterator = students.iterator();

        while (studentIterator.hasNext()) {
            if (studentIterator.next().getAverageAnnualMark() > bestStudent.getAverageAnnualMark()) {
                bestStudent = studentIterator.next();
            }
        }

        return bestStudent;
    }

    public List<Person> getStudents() {
        return students;
    }
}
