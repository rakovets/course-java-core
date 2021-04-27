package com.rakovets.course.java.core.practice.jcf_list.project_class.model;

import java.util.List;

public class SchoolClass {
    List<Student> studentsList;

    public SchoolClass(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public static Student getBestStudent(List<Student> studentsList) {
        Student bestStudent = studentsList.get(0);
        for (Student student : studentsList) {
            if (student.getAverageAnnualMark() > bestStudent.getAverageAnnualMark()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }
}
