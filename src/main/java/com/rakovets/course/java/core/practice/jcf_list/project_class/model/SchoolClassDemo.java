package com.rakovets.course.java.core.practice.jcf_list.project_class.model;

import com.rakovets.course.java.core.practice.jcf_list.project_class.comparator.StudentAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.project_class.comparator.StudentAverageAnnualMarkComparator;
import com.rakovets.course.java.core.practice.jcf_list.project_class.comparator.StudentNameAndSurnameComparator;

import java.util.ArrayList;
import java.util.List;

public class SchoolClassDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Robert", "Pattinson", 10, 6.6));
        studentList.add(new Student("George", "Clooney", 11, 8.0));
        studentList.add(new Student("Orlando", "Bloom", 12, 9.0));

        printStudents(studentList);

        studentList.sort(new StudentNameAndSurnameComparator());
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
