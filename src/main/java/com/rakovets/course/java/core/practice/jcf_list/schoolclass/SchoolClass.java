package com.rakovets.course.java.core.practice.jcf_list.schoolclass;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private List<Person> students;

    public void addStudents(Person person) {
        students.add(person);
    }

    public List<Person> getStudents() {
        return students;
    }

    public void setStudents(List<Person> students) {
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
}
