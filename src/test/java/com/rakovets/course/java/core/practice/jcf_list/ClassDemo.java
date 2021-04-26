package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.*;

import java.util.ArrayList;
import java.util.List;

public class ClassDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Andrej", "Masjanin", 15, 8.5));
        studentList.add(new Student("Marina", "Aleksandrova", 16, 10.0));
        studentList.add(new Student("Aleksandr","Belov", 17, 9.0));
        studentList.add(new Student("Oksana", "Smirnova", 14, 7.5));

        printStudents(studentList);

        studentList.sort(new StudentNameComparator());
        printStudents(studentList);

        studentList.sort(new StudentAverageAnnualMarkComparator());
        printStudents(studentList);

        studentList.sort(new StudentAgeComparator());
        printStudents(studentList);

        SchoolClass schoolClass = new SchoolClass(studentList);
        System.out.println(schoolClass.getBestStudent(studentList));

    }

    private static void printStudents(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        System.out.println();
    }
}
