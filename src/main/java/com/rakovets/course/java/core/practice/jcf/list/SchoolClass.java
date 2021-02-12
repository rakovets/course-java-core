package com.rakovets.course.java.core.practice.jcf.list;

import java.util.Comparator;
import java.util.List;

public class SchoolClass {
    private Student students;

    public SchoolClass(Student students) {
        this.students = students;
    }

    public static Student getBestStudent(List<Student> students) {
        Comparator studentCompareByAverage = new StudentCompareByAverage();
        students.sort(studentCompareByAverage);
        return students.get(0);
    }
    public static void sortedByNameAndSurname(List<Student> students) {
        Comparator studentCompareByNameAndSurname = new StudentCompareByName().thenComparing(new StudentCompareBySurname());
        students.sort(studentCompareByNameAndSurname);
    }

    public static void sortedByAge(List<Student> students) {
        Comparator studentCompareByAge = new StudentCompareByAge();
        students.sort(studentCompareByAge);
    }

    public static void sortedByAverageAnnualMark(List<Student> students) {
        Comparator studentCompareByAverage = new StudentCompareByAverage();
        students.sort(studentCompareByAverage);
    }
}
