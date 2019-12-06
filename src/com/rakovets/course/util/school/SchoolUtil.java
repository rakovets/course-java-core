package com.rakovets.course.util.school;

import java.util.List;

public class SchoolUtil {
    public static Student getBestStudent(List<Student> list) {
        double averageMark = 0.0;
        for (Student student : list) {
            if (student.getAverageAnnualMark() > averageMark) {
                averageMark = student.getAverageAnnualMark();
            }
        }
        Student bestStudent = null;
        for (Student student : list) {
            if (student.getAverageAnnualMark() == averageMark) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }

    public static void printList(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
