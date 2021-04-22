package com.rakovets.course.java.core.practice.jcf_list.studioTest;

import com.rakovets.course.java.core.practice.jcf_list._class.comporator.StudentAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list._class.comporator.StudentAverageAnnualMarkComparartor;
import com.rakovets.course.java.core.practice.jcf_list._class.comporator.StudentFullNameComporator;
import com.rakovets.course.java.core.practice.jcf_list._class.model.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list._class.model.Student;


import java.util.ArrayList;
import java.util.List;

public class ClassDemo {
    public static void main(String[] args) {
        List<Student> studentLis = new ArrayList<Student>();
        studentLis.add(new Student("Aliaksandr", "Petrov", 16, 8.3));
        studentLis.add(new Student("Aliaksandr", "Metrov", 15, 8.7));
        studentLis.add(new Student("Mikhail", "Petrov", 13, 8.4));
        studentLis.add(new Student("Mariya", "Sharapova", 17, 8.6));

        SchoolClass schoolClass = new SchoolClass(studentLis);

        System.out.println(schoolClass.getBestStudent(studentLis));

        studentLis.sort(new StudentFullNameComporator());
        printStudents(studentLis);
        System.out.println("\n");

        studentLis.sort(new StudentAgeComparator());
        printStudents(studentLis);
        System.out.println("\n");

        studentLis.sort(new StudentAverageAnnualMarkComparartor());
        printStudents(studentLis);
        System.out.println("\n");

    }

    public static void printStudents(List<Student> studentLis) {
        for (Student student : studentLis) {
            System.out.println(student.toString());
        }
    }
}
