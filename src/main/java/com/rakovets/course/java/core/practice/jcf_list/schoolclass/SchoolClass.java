package com.rakovets.course.java.core.practice.jcf_list.schoolclass;

import java.util.List;

public class SchoolClass {
    private final List<Person> students;

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    public Person getBestStudent(List<Person> students) {
        Person bestStudent = new Person();

        for (Person student : students) {
            if (student.getAverageAnnualMark() > bestStudent.getAverageAnnualMark()) {
                bestStudent = student;
            }
        }

        return bestStudent;
    }

    public List<Person> getStudents() {
        return students;
    }
}
