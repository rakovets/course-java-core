package com.rakovets.course.java.core.practice.jcf_list.school;

import java.util.List;

public class SchoolClass {
    private List<Person> students;

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    public Person getBestStudent(List<Person> students) {
        Person bestStudent = students.get(0);
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
