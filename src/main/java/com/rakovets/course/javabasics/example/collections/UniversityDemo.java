package com.rakovets.course.javabasics.example.collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class UniversityDemo {
    public static void main(String[] args) {
        List<Student> group = new ArrayList<>();
        group.add(new Student("Tom", 1));
        group.add(new Student("Tom", 3));
        group.add(new Student("Tom", 2));
        group.add(new Student("Tom", 4));
        System.out.println();

        group.sort(new StudentNameAndFeeComparator());

        System.out.println();



        //Arrays
        Student[] j109 = new Student[10];

        // Vector -> Stack
        Vector<Student> vectorStudent = new Vector();
        vectorStudent.add(new Student("Tom"));
        Student student = (Student) vectorStudent.get(0);
        System.out.println(student.getName());

        Stack stackStudent = new Stack();
        stackStudent.empty();

        // Hashtable
        Hashtable<Integer, Student> hashtableStudent = new Hashtable();
        hashtableStudent.put(1, new Student("Student1"));
        hashtableStudent.put(1, new Student("Student4"));
        hashtableStudent.put(1, new Student("Student2"));
        hashtableStudent.put(1, new Student("Student3"));

        System.out.println(hashtableStudent.get(1).getName());
        System.out.println(hashtableStudent.size());
    }
}
