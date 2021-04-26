package com.rakovets.course.java.core.practice.jcf_list._class;

import java.util.List;

public class SchoolClass {
    private List<Student> students;

    public SchoolClass(List<Student> students) {
        this.students = students;
    }

    public Student getBestStudent(List<Student> students) {
        Student maxAverageAnnualMark = students.get(0);
        for (Student student : students) {
            if (maxAverageAnnualMark.getAverageAnnualMark() < student.getAverageAnnualMark()) {
                maxAverageAnnualMark = student;
            }
        }
        return maxAverageAnnualMark;
    }
}
