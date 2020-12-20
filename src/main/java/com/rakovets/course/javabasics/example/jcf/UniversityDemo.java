package com.rakovets.course.javabasics.example.jcf;

import com.rakovets.course.javabasics.example.jcf.model.Student;

import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class UniversityDemo {
    public static void main(String[] args) {
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
