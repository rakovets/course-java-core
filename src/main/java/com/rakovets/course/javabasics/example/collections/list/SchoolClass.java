package com.rakovets.course.javabasics.example.collections.list;

import com.rakovets.course.javabasics.example.collections.list.comparators.StudentAverageMarksComparator;

import java.util.LinkedList;

public class SchoolClass {

    private final LinkedList<Student> students;

    public SchoolClass(LinkedList<Student> students) {
        this.students = students;
    }

    public Student getBestStudent(){
      students.sort(new StudentAverageMarksComparator());
      Student result = students.getLast();
      return result;
     }

}
