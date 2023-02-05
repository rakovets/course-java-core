package com.rakovets.course.java.core.practice.jcf_list.school_class;

import java.util.List;
import java.util.ListIterator;

public class SchoolClass {
    private final List<Person> students;

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    public Person getBestStudent(List<Person> students) {
        Person teachersPet = new Person();
        ListIterator<Person> studentsIterator = students.listIterator();
        while (studentsIterator.hasNext()) {
            if (studentsIterator.next().getAverageAnnualMark() > teachersPet.getAverageAnnualMark()) {
                teachersPet = studentsIterator.next();
            }
        }
        return teachersPet;
    }

    public List<Person> getStudents() {
        return students;
    }
}
