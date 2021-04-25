package com.rakovets.course.java.core.practice.jcf_list.schoolClass;

import java.util.ArrayList;

public class SchoolClass {
    ArrayList<Student> students;

    public static Student getBestStudent(ArrayList<Student> students) {
        double bestAverageAnnualMark =0.0;
        int index = 0;
        for (Student student : students) {
            if (student.getAverageAnnualMark() >= 0) {
                bestAverageAnnualMark = student.getAverageAnnualMark();
                index = students.indexOf(student);
            }
        }
        return students.get(index);
    }
}
