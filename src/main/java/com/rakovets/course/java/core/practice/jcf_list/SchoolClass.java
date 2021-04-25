package com.rakovets.course.java.core.practice.jcf_list;

import java.util.ArrayList;

public class SchoolClass {
    private ArrayList<Student> student;

    public SchoolClass(ArrayList<Student> student) {
        this.student = student;
    }

    public Student getBestStudent() {
        Student bestStudent = student.get(0);
        for (Student student : student) {
            if (student.getAverageAnnualMark() > bestStudent.getAverageAnnualMark()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }
}
