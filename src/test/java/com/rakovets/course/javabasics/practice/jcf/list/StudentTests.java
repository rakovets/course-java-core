package com.rakovets.course.javabasics.practice.jcf.list;

import com.rakovets.course.javabasics.example.collections.list.SchoolClass;
import com.rakovets.course.javabasics.example.collections.list.Student;
import com.rakovets.course.javabasics.example.collections.list.Studio;
import com.rakovets.course.javabasics.example.collections.list.comparators.StudentAgeComparator;
import com.rakovets.course.javabasics.example.collections.list.comparators.StudentFullNameComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class StudentTests {
    LinkedList<Student> students = new LinkedList<Student>();

    @BeforeEach
    void intro() {
        students.add(new Student("Tom", "Crouse", 25, 3.6));
        students.add(new Student("Tom", "Diesel", 23, 4.3));
        students.add(new Student("Tom", "Sinatra", 22, 4.2));
        students.add(new Student("Tom", "Potter", 19, 5.5));
        students.add(new Student("Tom", "Hanks", 20, 5.1));
    }

    @Test
    void getBestStudentTest() {
        SchoolClass group = new SchoolClass(students);
        Assertions.assertEquals("Student Name is Tom, Surname Potter, Aaverage mark 5.5, Age 19\n", group.getBestStudent().toString());
    }

    @Test
    void StudentFullNameSortingTest() {
        students.sort(new StudentFullNameComparator());
        Assertions.assertEquals("Student Name is Tom, Surname Sinatra, Aaverage mark 4.2, Age 22\n", students.getLast().toString());
    }

    @Test
    void StudentAgeSortingTest() {
        SchoolClass group = new SchoolClass(students);
        students.sort(new StudentAgeComparator());
        Assertions.assertEquals("Student Name is Tom, Surname Crouse, Aaverage mark 3.6, Age 25\n", students.getLast().toString());
    }


}





