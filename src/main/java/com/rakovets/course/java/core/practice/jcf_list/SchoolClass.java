package com.rakovets.course.java.core.practice.jcf_list;

import java.util.ArrayList;

public class SchoolClass {
    private ArrayList<Student> students;

    public SchoolClass(ArrayList<Student> students) {
        this.students = students;
    }

    public Student getBestStudent(ArrayList<Student> students) {
        Student bestStudent = students.get(0);
        for (Student student : students) {
            if (student.getAverageAnnualMark() > bestStudent.getAverageAnnualMark()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }
}
