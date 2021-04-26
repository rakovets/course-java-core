package com.rakovets.course.java.core.practice.jcf_list;


import com.rakovets.course.java.core.practice.jcf_list.cclass.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list.cclass.Student;
import com.rakovets.course.java.core.practice.jcf_list.cclass.comparator.StudentAgeComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassDemo {
    public static void main(String[] args) {
        Student student = new Student("Alex", "Dyuba", 19, 4.8);
        Student student1 = new Student("Filen", "Druzki", 21, 3.9);
        Student student2 = new Student("Efim", "Pindukin", 17, 4.9);
        SchoolClass schoolClass = new SchoolClass(Arrays.asList(student, student1, student2));
        System.out.println(schoolClass.getBestStudent(schoolClass.getStudents()));
        System.out.println(student.getSurname());
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAverageAnnualMark());
    }
}
